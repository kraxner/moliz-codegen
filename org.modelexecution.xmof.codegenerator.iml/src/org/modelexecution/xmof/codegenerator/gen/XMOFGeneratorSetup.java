package org.modelexecution.xmof.codegenerator.gen;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class XMOFGeneratorSetup implements ISetup{

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new XMOFGeneratorModule());
	}

}
