package com.hzz.statemachine.config.configurers;

import java.util.ArrayList;
import java.util.List;

import com.hzz.statemachine.context.SMContext;
import com.hzz.statemachine.events.SMEvent;
import com.hzz.statemachine.states.SMState;

public class SMTransitionConfigurer<S, E, R> {
	private List<TransitionConfigurer<S, E, R>> transitionData = new ArrayList<TransitionConfigurer<S, E, R>>();

	public void add(TransitionConfigurer<S, E, R> transition) {
		transitionData.add(transition);
	}

	public R run(SMState state, SMEvent event, SMContext context) {
		for (TransitionConfigurer<S, E, R> tran : transitionData) {
			if (tran.getSource() == state && tran.getEvent() == event) {
				return tran.getListener().listen(context);
			}
		}
		return null;
	}
}
