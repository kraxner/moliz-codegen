package org.modelexecution.xmof.codegenerator.gen;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;
import com.google.inject.Module;

public class XMOFGeneratorSupport extends
AbstractGenericResourceSupport {
	@Override
	protected Module createGuiceModule() {
		return new XMOFGeneratorModule();
	}
}
