package org.modelexecution.xmof.vm.codegenerator;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.event.impl.ActivityEntryEventImpl;
import org.modelexecution.fumldebug.core.event.impl.ActivityExitEventImpl;
import org.modelexecution.fumldebug.core.event.impl.ActivityNodeEntryEventImpl;
import org.modelexecution.fumldebug.core.event.impl.ActivityNodeExitEventImpl;
import org.modelexecution.fumldebug.core.event.impl.BreakpointEventImpl;
import org.modelexecution.fumldebug.core.event.impl.ExtensionalValueEventImpl;
import org.modelexecution.fumldebug.core.event.impl.FeatureValueEventImpl;
import org.modelexecution.fumldebug.core.event.impl.SuspendEventImpl;
import org.modelexecution.xmof.vm.IXMOFVirtualMachineListener;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;
import org.modelexecution.xmof.vm.XMOFVirtualMachineEvent;
import org.modelexecution.xmof.vm.codegenerator.transformers.Transformer;
import org.modelexecution.xmof.vm.codegenerator.transformers.TransformerActivityEntryEvent;
import org.modelexecution.xmof.vm.codegenerator.transformers.TransformerActivityExitEvent;
import org.modelexecution.xmof.vm.codegenerator.transformers.TransformerActivityNodeEntryEventImpl;
import org.modelexecution.xmof.vm.codegenerator.transformers.TransformerActivityNodeExitEventImpl;
import org.modelexecution.xmof.vm.codegenerator.transformers.TransformerExtensionalValueEvent;
import org.modelexecution.xmof.vm.codegenerator.transformers.TransformerFeatureValueEvent;
import org.modelexecution.xmof.vm.codegenerator.transformers.TransformerSuspendEventImpl;

public class CodeGenerator implements ExecutionEventListener,
		IXMOFVirtualMachineListener {

	private static final Logger LOG = Logger.getLogger(CodeGenerator.class
			.getName());

	Map<Class<? extends Event>, Transformer> transformers = new HashMap<>();

	private XMOFVirtualMachine vm;
	private PrintWriter writer;

	public CodeGenerator() {
		transformers.put(ExtensionalValueEventImpl.class,
				new TransformerExtensionalValueEvent());
		transformers.put(FeatureValueEventImpl.class,
				new TransformerFeatureValueEvent());
		transformers.put(ActivityEntryEventImpl.class,
				new TransformerActivityEntryEvent());
		transformers.put(ActivityExitEventImpl.class,
				new TransformerActivityExitEvent());
		transformers.put(ActivityNodeEntryEventImpl.class,
				new TransformerActivityNodeEntryEventImpl());
		transformers.put(ActivityNodeExitEventImpl.class,
				new TransformerActivityNodeExitEventImpl());
		transformers.put(SuspendEventImpl.class,
				new TransformerSuspendEventImpl());
		transformers.put(BreakpointEventImpl.class,
				new TransformerBreakpointEventImpl());
	}

	public void init(XMOFVirtualMachine vm) {
		this.vm = vm;
	}

	public void generate(Writer writer) {
		this.writer = new PrintWriter(writer, true);
		vm.addVirtualMachineListener(this);
		vm.run();
	}

	@Override
	public void notify(Event event) {
		if (!transformers.containsKey(event.getClass())) {
			return;
		}

		Transformer transformer = transformers.get(event.getClass());
		String transformed = transformer.transform(event);
		if (transformed != null && !transformed.isEmpty()) {
			writer.println(transformed);
		}
	}

	@Override
	public void notify(XMOFVirtualMachineEvent event) {
		switch (event.getType()) {
		case START:
			vm.addRawExecutionEventListener(this);
			break;
		case STOP:
			vm.removeRawExecutionEventListener(this);
			vm.removeVirtualMachineListener(this);
			break;
		default:
			break;
		}
	}

}
