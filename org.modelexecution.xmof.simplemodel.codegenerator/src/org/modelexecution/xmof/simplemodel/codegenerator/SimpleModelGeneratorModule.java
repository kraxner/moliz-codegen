package org.modelexecution.xmof.simplemodel.codegenerator;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;


public class SimpleModelGeneratorModule extends
AbstractGenericResourceRuntimeModule {

@Override
protected String getLanguageName() {
	return "SimpleModel";
}

@Override
protected String getFileExtensions() {
	return "xmof";
}

public Class<? extends IGenerator> bindIGenerator() {
	return SimpleModelGenerator.class;
}

public Class<? extends ResourceSet> bindResourceSet() {
	return ResourceSetImpl.class;
}

}
