package com.hzz.statemachine;

import com.hzz.statemachine.config.configurers.SMTransitionConfigurer;
import com.hzz.statemachine.config.configurers.TransitionConfigurer;
import com.hzz.statemachine.context.SMContext;
import com.hzz.statemachine.events.SMEvent;
import com.hzz.statemachine.listener.SMListener;
import com.hzz.statemachine.states.SMState;

public class StateMachineDemo {

	public static void main(String[] args) {
		SMListener<String> listener = new SMListener<String>() {
			@Override
			public String listen(SMContext context) {
				return "listener called";
			}
		};
		TransitionConfigurer<SMState, SMEvent, String> tc1 = new TransitionConfigurer<SMState, SMEvent, String>()
				.source(SMState.Start).target(SMState.State1)
				.event(SMEvent.Ev1).listener(listener);
		TransitionConfigurer<SMState, SMEvent, String> tc2 = new TransitionConfigurer<SMState, SMEvent, String>()
				.source(SMState.Start).target(SMState.State2)
				.event(SMEvent.Ev2).listener(listener);
		TransitionConfigurer<SMState, SMEvent, String> tc3 = new TransitionConfigurer<SMState, SMEvent, String>()
				.source(SMState.Start).target(SMState.End).event(SMEvent.Ev3)
				.listener(listener);
		SMTransitionConfigurer<SMState, SMEvent, String> smTransitions = new SMTransitionConfigurer<SMState, SMEvent, String>();
		smTransitions.add(tc1);
		smTransitions.add(tc2);
		smTransitions.add(tc3);

		SMState s1 = SMState.Start;
		SMEvent e = SMEvent.Ev2;
		System.out.println(smTransitions.run(s1, e, new SMContext() {
		}));
	}

}
