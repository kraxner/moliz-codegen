package org.modelexecution.xmof.vm.codegenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Logger;

import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityExitEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeExitEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.event.FeatureValueEvent;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;
import org.modelexecution.xmof.vm.IXMOFVirtualMachineListener;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;
import org.modelexecution.xmof.vm.XMOFVirtualMachineEvent;
import org.modelexecution.xmof.vm.codegenerator.utils.Naming;

import fUML.Syntax.Actions.BasicActions.CallBehaviorAction;
import fUML.Syntax.Actions.IntermediateActions.CreateObjectAction;
import fUML.Syntax.Activities.IntermediateActivities.ActivityNode;
import fUML.Syntax.Activities.IntermediateActivities.DecisionNode;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.Behavior;

public class CodeGenerator implements ExecutionEventListener,
		IXMOFVirtualMachineListener {

	private static final Logger LOG = Logger.getLogger(CodeGenerator.class
			.getName());


	private XMOFVirtualMachine vm;
	
	private Stack<Method> methodStack;
	private Map<String, List<Method>> classMethods;
	
	public CodeGenerator() {
		methodStack = new Stack<>();
		classMethods = new HashMap<>();
	}

	public void init(XMOFVirtualMachine vm) {
		this.vm = vm;
	}

	public void generate() {
		vm.addVirtualMachineListener(this);
		vm.run();
	}
	
	public List<Method> getMethods(String classname) {
		return classMethods.get(classname);
	}

	public String getMethod(String classname, String methodname	) {
		List<Method> methods = classMethods.get(classname);
		if (methods != null) {
			for (Method m : methods) {
				if (m.getName().equals(methodname)) {
					return m.getBuffer().toString();
				}
			}
		}
		return " // not defined";
	}

	@Override
	public void notify(Event event) {
		
		if (event instanceof ActivityEntryEvent) {
			activiteEntry((ActivityEntryEvent) event);
		} else if (event instanceof ActivityExitEvent) {
			activiteExit((ActivityEntryEvent) event);
		} else if (event instanceof ActivityNodeEntryEvent) {
			activityNodeEntry((ActivityNodeEntryEvent) event);
		} else if (event instanceof FeatureValueEvent) {
			featureValue((FeatureValueEvent) event);
		} else if (event instanceof ActivityNodeExitEvent) {
			activityNodeExit((ActivityNodeExitEvent)event);
		} else {
			LOG.warning("	unkown event: " + event.toString());
		}
	}

	private void featureValue(FeatureValueEvent event) {
		Method method = methodStack.peek();
		String s = "// feature value: ";
		s += "name=" + event.getFeatureValue().feature.name;
		s += ", value=" + event.getFeatureValue().values.get(0);

		method.getBuffer().append(s).append(Naming.CRLF);
		
	}

	private void activityNodeEntry(ActivityNodeEntryEvent event) {
		ActivityNode node = event.getNode();
		Method method = methodStack.peek();
		if (node instanceof CreateObjectAction) {
			CreateObjectAction coa = (CreateObjectAction) node;
			String className = coa.classifier.name;
			String packageName = coa.classifier.package_.name;
			String name = makeVariableName(node.name);
			method.defineVariable(name, null);
			method.getBuffer().append(className + " " + name + " = " + Naming.makeCreateStatement(packageName, className) + ";" + Naming.CRLF);
		} else if (node instanceof CallBehaviorAction) {
			CallBehaviorAction callBehaviorAction = (CallBehaviorAction) node;
			Behavior behavior = callBehaviorAction.behavior;
			String call = callBehaviorAction.input.get(0).name + " " + behavior.name + " " + callBehaviorAction.input.get(1).name;

			if (behavior instanceof OpaqueBehavior) {
				OpaqueBehavior ob = (OpaqueBehavior) behavior; 
				method.getBuffer().append(ob.getBody()).append(Naming.CRLF);
			} else {
				method.getBuffer().append("// " + call);
			}
		} else if (node instanceof DecisionNode) {
			DecisionNode decisionNode = (DecisionNode) node;
			method.getBuffer().append("// if (" + decisionNode.name + ": " + decisionNode.decisionInput.name ).append(Naming.CRLF);
		}

	}
	
	private void activityNodeExit(ActivityNodeExitEvent event) {
		Method method = methodStack.peek();
		ActivityNode node = event.getNode();
		if (node instanceof CreateObjectAction) {
			CreateObjectAction coa = (CreateObjectAction) node;
			method.getBuffer().append("// " + coa.toString() + Naming.CRLF);
		}
	}	
	
	public String makeVariableName(String base) {
		return Naming.makeIdentifier(base);
	}

	
	
	private List<Method> getMethodsOfClass(final String classname) {
		List<Method> methods = classMethods.get(classname);
		if (methods == null) {
			methods = new ArrayList<>();
			classMethods.put(classname, methods);
		}
		return methods;
	}
	
	private void activiteEntry(ActivityEntryEvent event) {
		String classname = (event.getActivity().context != null) ? event.getActivity().context.name : "default";
		
		Method method = new Method(classname, event.getActivity().name);
		methodStack.push(method);
		getMethodsOfClass(classname).add(method);
	}
	private void activiteExit(ActivityEntryEvent event) {
		methodStack.pop();
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
