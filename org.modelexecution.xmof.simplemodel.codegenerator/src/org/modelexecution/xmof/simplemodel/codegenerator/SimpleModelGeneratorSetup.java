package org.modelexecution.xmof.simplemodel.codegenerator;

import org.eclipse.xtext.ISetup;


import com.google.inject.Guice;
import com.google.inject.Injector;

public class SimpleModelGeneratorSetup implements ISetup{

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new SimpleModelGeneratorModule());
	}

}