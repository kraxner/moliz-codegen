package org.modelexecution.xmof.codegenerator.gen

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.modelexecution.xmof.Syntax.Classes.Kernel.MainEClass
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.Behavior
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity

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
    		var MainEClass main = o as MainEClass
    		var Behavior behavior = main.classifierBehavior
    		var Activity activity = behavior as Activity
    		var String name = activity.name
    	}
    	
    	
//    	for (State s : m.getStates()) {
//    		fsa.generateFile("asfd", "asdf");
//    		
//    	}
//        for (e : m) {
//            e.compile(fsa)
//        }
    }
 
	 	
}