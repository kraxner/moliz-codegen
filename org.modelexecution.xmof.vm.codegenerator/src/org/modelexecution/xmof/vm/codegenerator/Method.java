package org.modelexecution.xmof.vm.codegenerator;

import java.util.HashMap;
import java.util.Map;

public class Method {
	private StringBuffer body;
	
	private String name;
	private String classname;
	
	private Map<Object, String> variables;
	
	
	public Method(final String classname, final String name) {
		this.classname = classname;
		this.name = name;
		
		body = new StringBuffer();
		variables = new HashMap<>();
	}
	

	public String getVariable(Object obj) {
		return variables.get(obj);
	}
	
	public void defineVariable(String name, Object obj) {
		variables.put(obj, name);
	}


	public StringBuffer getBuffer() {
		return body;
	}


	public void setBuffer(StringBuffer buffer) {
		this.body = buffer;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
