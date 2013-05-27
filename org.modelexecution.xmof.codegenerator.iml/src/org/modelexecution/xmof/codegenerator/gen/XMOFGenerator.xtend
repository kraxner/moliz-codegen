package org.modelexecution.xmof.codegenerator.gen

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.modelexecution.xmof.Syntax.Classes.Kernel.MainEClass
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.Behavior
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation
import org.eclipse.emf.ecore.EClassifier
import org.modelexecution.xmof.Syntax.Classes.Kernel.ParameterDirectionKind
import org.eclipse.emf.ecore.EDataType
import org.modelexecution.xmof.Syntax.Classes.Kernel.DirectedParameter

class XMOFGenerator implements IGenerator{
	

	 override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	 	for (EObject obj : resource.contents) {
	 		switch (obj) {
	 			EPackage : generate(obj, fsa) 				
	 			
	 		}
	 	}
    }
 
    def void generate(EPackage m, IFileSystemAccess fsa) {
    	for (EObject o : m.eContents) {
    		switch (o) {
    			MainEClass : fsa.generateFile('org/modelexecution/xmof/codegenerator/iml/' + '''«o.name»'''+'Xmof.java', o.generateMainEClass())
    			//TODO: opaquebehaviors are also behavioredEclass - so ignore them for generation first
    			OpaqueBehavior : o.doNothing() 
    			BehavioredEClass: fsa.generateFile('org/modelexecution/xmof/codegenerator/iml/' + '''«o.name»'''+'Xmof.java', o.generateBehavioredEClass())
    		}
//    		var MainEClass main = o as MainEClass
//    		var Behavior behavior = main.classifierBehavior
//    		var Activity activity = behavior as Activity
//    		var String name = activity.name
    	}
    }
    
    def void doNothing(EObject obj) {
    	
    }
    
    // generation of the MainEClass
    def generateMainEClass(MainEClass obj) '''
    	package org.modelexecution.xmof.codegenerator.iml;
    	
    	import impModLangConfiguration.impl.*;
    	
    	public class «obj.name»Xmof extends «obj.name»Impl {
    		«var Activity activity = obj.classifierBehavior as Activity»
    		«generateMethodForActivity(activity)»
    	}
    '''
    
    // generate a activity
    def generateMethodForActivity(Activity activity) {
    	
    	if (activity != null) {
    		// TODO: determine returntype of the acitivity
    		var String activityReturnType = "void";
    		'''
    		public «activityReturnType» «activity.name»Activity () {
    			
    		}
    		'''
    	}
    }
    
    // generation of a behavioredEclass
    def generateBehavioredEClass(BehavioredEClass obj) '''
    	package org.modelexecution.xmof.codegenerator.iml;
    	
    	import impModLangConfiguration.impl.*;
    	
    	public class «obj.name»Xmof extends «obj.name»Impl {
    	
    		«FOR child : obj.ownedBehavior»
    			«IF child instanceof Activity»
    				«generateMethodForActivity(child as Activity)»
    			«ENDIF»
    		«ENDFOR»   	
    	
    		«FOR operation : obj.EAllOperations»
    			«IF operation instanceof BehavioredEOperation»
    				«var String returnType = getReturnType(operation as BehavioredEOperation)»
    				@Override
    				public «returnType» «operation.name» («getOperationParameterList(operation as BehavioredEOperation)») {
    					«IF returnType != "void"»
    						return «operation.name»Activity();
    					«ELSE»
    						«operation.name»Activity();
    					«ENDIF»
    					
    				}
    			«ENDIF»
    		«ENDFOR»    		
    	}
    '''
    
    // returns the java type of a behavioredEoperation
     def String getReturnType(BehavioredEOperation op) {
     	for (typeParam : op.EParameters) {
     		var DirectedParameter dparam = typeParam as DirectedParameter
     		if (dparam.direction == ParameterDirectionKind::OUT) {
     			return ecoreTypeToJavaType(dparam.EType)
     		} 
     	}	
     	return "void"
     }
     
     // returns the parameterlist of a behavioredEOperation
     def String getOperationParameterList(BehavioredEOperation op) {
     	var String paramList = ""
     	var boolean first = true;
     	for (typeParam : op.EParameters) {
     		if (!first) {
     			paramList = paramList.concat(",")
     		}
     		var DirectedParameter dparam = typeParam as DirectedParameter
     		if (dparam.direction == ParameterDirectionKind::IN) {
     			paramList = paramList.concat(ecoreTypeToJavaType(dparam.EType) + " " + dparam.name)
     			first = false
     		}     		
     	}
     	return paramList
     }
     
     // casts a ecore datatype to a java data type
     def String ecoreTypeToJavaType(EClassifier cl) {
     	if (cl == null)
     		return "void"
     	else {     	
	     	switch cl.name {
	     		case "EBoolean": return "boolean"
	     		case "EInt": return "int"
	     	}     
     	}     		
     	return "void"
     }
	 	
}