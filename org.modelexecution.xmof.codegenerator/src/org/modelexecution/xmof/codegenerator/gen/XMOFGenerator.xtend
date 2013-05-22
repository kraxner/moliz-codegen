package org.modelexecution.xmof.codegenerator.gen

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import fsa.FSA
import fsa.State
import org.eclipse.emf.ecore.EClass
import org.modelexecution.xmof.Syntax.Classes.Kernel.MainEClass
import org.eclipse.emf.ecore.EPackage

class XMOFGenerator implements IGenerator{
	

	 override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	 	for (EObject obj : resource.contents) {
	 		switch (obj) {
	 			EPackage : generate(obj, fsa) 				
	 			
	 		}
	 	}
	 	
//	 	fsa.generateFile("lala", "hello there!");
//	 	for (EObject obj : resource.contents) {
//			switch (obj) {
//				FileDefinitionSet : obj.generateFiles(fsa)
//			}
//		}
    }
 
    def void generate(EPackage m, IFileSystemAccess fsa) {
    	
    	for (EObject o : m.eContents) {
    		switch (o) {
    			MainEClass : fsa.generateFile("Eclass", "asdf")
    		}
    	}
    	
    	
//    	for (State s : m.getStates()) {
//    		fsa.generateFile("asfd", "asdf");
//    		
//    	}
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