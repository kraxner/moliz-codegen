package org.modelexecution.xmof.vm.codegenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.vm.XMOFBasedModel;

/**
 * Helper class to create an xMOF based model.
 * 
 * @author micalo
 */
public class XMOFBasedModelLoader {
	private static final Logger LOG = Logger
			.getLogger(XMOFBasedModelLoader.class.getName());

	private ResourceSet resourceSet;
	private ConfigurationObjectMap configurationMap;

	public XMOFBasedModelLoader() {
		// create a resource set and add a default factory for xmi files, this
		// way it works also outside of eclipse
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());
	}

	/**
	 * Creates an xMOF based model from a given model instance, the
	 * corresponding xMOF configuration and and optional initialization model.
	 * 
	 * NOTE: Provide absolute URIs to prevent problems with resolving referenced
	 * schemas.
	 * 
	 * @param xmofFile
	 *            URI of the xMOF configuration
	 * @param inputModelFile
	 *            URI of the model instance
	 * @param initModelFile
	 *            URI of the initialization model (optional)
	 * @return
	 */
	public XMOFBasedModel loadXMOFBasedModel(URI xmofFile, URI inputModelFile,
			URI initModelFile) {
		Collection<EObject> inputModelElements = loadModelElements(inputModelFile);
		Collection<EObject> initializationModelElements = loadModelElements(initModelFile);

		if (xmofFile != null) {
			Collection<EPackage> configurationPackages = loadConfigurationMetamodel(xmofFile);
			configurationMap = new ConfigurationObjectMap(inputModelElements,
					configurationPackages, initializationModelElements);

			return new XMOFBasedModel(
					configurationMap.getConfigurationObjects());
		} else {
			return new XMOFBasedModel(inputModelElements);
		}
	}

	private Collection<EPackage> loadConfigurationMetamodel(
			URI confMetamodelPath) {
		Resource resource = loadResource(confMetamodelPath);
		Collection<EPackage> confMMPackages = new ArrayList<EPackage>();
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof EPackage) {
				EPackage ePackage = (EPackage) eObject;
				if (EPackage.Registry.INSTANCE.containsKey(ePackage.getNsURI())) {
					EPackage registeredPackage = (EPackage) EPackage.Registry.INSTANCE
							.get(ePackage.getNsURI());
					reloadPackage(registeredPackage);
					confMMPackages.add(registeredPackage);
				} else {
					confMMPackages.add(ePackage);
				}
			}
		}
		return confMMPackages;
	}

	private void reloadPackage(EPackage registeredPackage) {
		try {
			registeredPackage.eResource().unload();
			registeredPackage.eResource().load(null);
		} catch (IOException e) {
			LOG.log(Level.SEVERE,
					"Failed to reload epackage "
							+ String.valueOf(registeredPackage.getName()), e);
		}
	}

	public Collection<EObject> loadModelElements(URI uri) {
		Resource resource = loadResource(uri);
		if (resource == null) {
			return null;
		}
		return resource.getContents();
	}

	private Resource loadResource(URI uri) {
		if (uri == null) {
			return null;
		}
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		// options.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");

		Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(options);
			return resource;
		} catch (IOException e) {
			LOG.log(Level.SEVERE,
					"Failed to load resource " + String.valueOf(uri), e);
		}
		return null;
	}

}
