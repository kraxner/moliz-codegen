package org.modelexecution.xmof.simplemodel.codegenerator;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;


import com.google.inject.Module;

public class SimpleModelGeneratorSupport  extends
AbstractGenericResourceSupport {
	@Override
	protected Module createGuiceModule() {
		return new SimpleModelGeneratorModule();
	}
}