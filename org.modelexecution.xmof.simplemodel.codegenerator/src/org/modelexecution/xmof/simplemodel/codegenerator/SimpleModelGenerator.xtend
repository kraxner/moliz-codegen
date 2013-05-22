package org.modelexecution.xmof.simplemodel.codegenerator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject

class SimpleModelGenerator implements IGenerator{
	

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		for (EObject obj : input.contents) {
			
		}
    }
 

	
}