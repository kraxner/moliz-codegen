package org.modelexecution.xmof.vm.codegenerator.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.modelexecution.xmof.vm.XMOFBasedModel;
import org.modelexecution.xmof.vm.codegenerator.XMOFBasedModelLoader;

public class XMOFBasedModelLoaderTest {

	@Test
	public void loadModelInstance() {
		XMOFBasedModelLoader loader = new XMOFBasedModelLoader();
		URI uri = URI.createFileURI((new File("resources/iml/iml1.xmi")).getAbsolutePath()) ;
		assertTrue(uri.isFile());
		Collection<EObject> elements = loader.loadModelElements(uri);
		assertNotNull(elements);
		assertFalse(elements.isEmpty());
	}
	
	@Test
	public void loadXMOFBasedModel() {
		XMOFBasedModelLoader loader = new XMOFBasedModelLoader();

		URI xmofFile = URI.createFileURI((new File("resources/iml/impl.xmof")).getAbsolutePath());
		URI inputModelFile = URI.createFileURI((new File("resources/iml/iml1.xmi")).getAbsolutePath());
		XMOFBasedModel model = loader.loadXMOFBasedModel(xmofFile, inputModelFile, null);
		assertNotNull(model);
	}
}
