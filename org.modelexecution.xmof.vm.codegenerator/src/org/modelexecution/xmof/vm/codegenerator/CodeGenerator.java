package org.modelexecution.xmof.vm.codegenerator;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Logger;

import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;

public class CodeGenerator implements ExecutionEventListener {
	
	private static final Logger LOG = Logger.getLogger(CodeGenerator.class.getName()) ;
	
	private XMOFVirtualMachine vm;
	private BufferedWriter writer;
	
	public CodeGenerator() {
	}
	
	public void init(XMOFVirtualMachine vm) {
		this.vm = vm;
	}
	
	public void generate(Writer writer) {
		this.writer = new BufferedWriter(writer);
		vm.run();		
	}
	
	@Override
	public void notify(Event event) {
		try {
			
			// TODO: generate code
			writer.write(event.toString());
			
		} catch (IOException e) {
			LOG.severe("Failed to write event: " + event.toString());			
		}
	}
	

}
