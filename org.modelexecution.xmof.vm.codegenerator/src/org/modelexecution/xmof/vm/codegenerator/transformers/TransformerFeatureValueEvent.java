package org.modelexecution.xmof.vm.codegenerator.transformers;

import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.event.FeatureValueEvent;

public class TransformerFeatureValueEvent extends AbstractTransformer implements
		Transformer {
	@Override
	public String transform(Event event) {
		FeatureValueEvent fve = (FeatureValueEvent) event;

		String s = "feature value: ";

		s += "name=" + fve.getFeatureValue().feature.name;
		s += ", value=" + fve.getFeatureValue().values.get(0);

		
		return s;
	}
}
