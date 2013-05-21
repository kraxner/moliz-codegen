package org.modelexecution.xmof.codegenerator.gen

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import fsa.FSA
import fsa.State

class XMOFGenerator implements IGenerator{
	

	 override void doGenerate(Resource resource, IFileSystemAccess fsa) {
        for (EObject obj : resource.contents) {
			switch (obj) {
				FSA : obj.generate(fsa)
			}
		}
    }
 
    def void generate(FSA m, IFileSystemAccess fsa) {
    	
    	
    	for (State s : m.getStates()) {
    		fsa.generateFile("asfd", "asdf");
    		
    	}
//        for (e : m) {
//            e.compile(fsa)
//        }
    }
 
//    def compile(Element e, IFileSystemAccess fsa) {
//        fsa.generateFile(e.name+".txt", '''
//        this is element «e.name»
//        ''')
//    }
 
    //def dispatch void compile(EObject m, IFileSystemAccess fsa) { }
	
}