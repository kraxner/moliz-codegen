package org.modelexecution.xmof.vm.codegenerator.transformers;

import org.modelexecution.fumldebug.core.event.Event;

public interface Transformer {
	String transform(Event event);
}
