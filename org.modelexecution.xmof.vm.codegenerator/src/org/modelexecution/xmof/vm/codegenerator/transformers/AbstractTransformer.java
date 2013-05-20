package org.modelexecution.xmof.vm.codegenerator.transformers;

import org.modelexecution.fumldebug.core.event.Event;

public abstract class AbstractTransformer implements Transformer {
	@Override
	public String transform(Event event) {
		return event.toString();
	}
}
