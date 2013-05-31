package org.modelexecution.xmof.vm.codegenerator.utils;

public class Naming {
	
	public static final String CRLF = "\n";
	
	public static String makeCreateStatement(String packageName, String className) {
		return firstToUpper(makeFactoryName(packageName)) + ".eINSTANCE.create" + className +"()"; 
	}
	
	public static String makeFactoryName(String packageName) {
		return packageName + "Factory";
	}
	

	public static String makeIdentifier(String name) {
		return name.replaceAll("[^0-9a-zA-Z_]", "_");
	}
	
	public static String firstToUpper(String s) {
		return s.substring(0,1).toUpperCase() + s.substring(1); 
	}

}
