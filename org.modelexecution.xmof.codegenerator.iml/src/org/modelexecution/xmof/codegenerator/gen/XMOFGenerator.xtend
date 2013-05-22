package org.modelexecution.xmof.codegenerator.gen

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import fsa.FSA
import fsa.State

class XMOFGenerator implements IGenerator{
	

	 override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	 	
	 	fsa.generateFile("lala", "hello there!");
	 	}
	 	
}