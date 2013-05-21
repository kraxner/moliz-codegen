package org.modelexecution.xmof.codegenerator.gen

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import javax.lang.model.element.Element

class XMOFGenerator implements IGenerator{
	

	 override void doGenerate(Resource resource, IFileSystemAccess fsa) {
        for (EObject o : resource.contents) {
            o.compile(fsa)
        }
    }
 
//    def dispatch void compile(FSA m, IFileSystemAccess fsa) {
//        for (e : m.elements) {
//            e.compile(fsa)
//        }
//    }
 
    def compile(Element e, IFileSystemAccess fsa) {
//        fsa.generateFile(e.name+".txt", '''
//        this is element «e.name»
//        ''')
    }
 
    def dispatch void compile(EObject m, IFileSystemAccess fsa) { }
	
}