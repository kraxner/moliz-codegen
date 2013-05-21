package org.modelexecution.xmof.codegenerator.gen;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class XMOFGeneratorModule  extends
	AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "org.modelexecution.xmof";
	}
	
	@Override
	protected String getFileExtensions() {
		return "xmof";
	}
	
	public Class<? extends IGenerator> bindIGenerator() {
		return XMOFGenerator.class;
	}
	
	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}

}

