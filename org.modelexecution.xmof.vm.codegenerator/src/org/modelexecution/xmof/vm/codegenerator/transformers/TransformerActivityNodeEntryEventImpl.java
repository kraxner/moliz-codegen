package org.modelexecution.xmof.vm.codegenerator.transformers;

import org.modelexecution.fumldebug.core.event.ActivityNodeEntryEvent;
import org.modelexecution.fumldebug.core.event.Event;

import fUML.Syntax.Actions.BasicActions.CallBehaviorAction;
import fUML.Syntax.Actions.BasicActions.InputPin;
import fUML.Syntax.Actions.IntermediateActions.CreateObjectAction;
import fUML.Syntax.Activities.IntermediateActivities.ActivityNode;
import fUML.Syntax.Activities.IntermediateActivities.DecisionNode;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.Behavior;

public class TransformerActivityNodeEntryEventImpl extends AbstractTransformer
		implements Transformer {

	@Override
	public String transform(Event event) {
		ActivityNodeEntryEvent ane = (ActivityNodeEntryEvent) event;

		String s = "";
		// "node entry: ";
		// s += "name=" + ane.getNode().name;

		ActivityNode node = ane.getNode();
		// s += node.getXmiId() + " ";
		if (node instanceof CreateObjectAction) {
			CreateObjectAction coa = (CreateObjectAction) node;
			s += "new " + coa.classifier.name + "();";
		} else if (node instanceof CallBehaviorAction) {
			CallBehaviorAction callBehaviorAction = (CallBehaviorAction) node;
			Behavior behavior = callBehaviorAction.behavior;

			InputPin input0 = callBehaviorAction.input.get(0);
			
			s += callBehaviorAction.input.get(0).name + " " + behavior.name
					+ " " + callBehaviorAction.input.get(1).name;
		} else if (node instanceof DecisionNode) {
			DecisionNode decisionNode = (DecisionNode) node;
			s += ", decision=" + node.name;

			Behavior behavior = decisionNode.decisionInput;
			if (behavior != null) {
				s += ", behavior=" + behavior.name;
			}
		}

		return s;
	}
}
