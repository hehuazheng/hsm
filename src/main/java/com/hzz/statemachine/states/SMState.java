package com.hzz.statemachine.states;

public abstract class SMState {
	abstract String getName();

	public static final SMState Start = new SMState() {
		@Override
		String getName() {
			return "Start";
		}
	};
	public static final SMState State1 = new SMState() {
		@Override
		String getName() {
			return "State1";
		}
	};
	public static final SMState State2 = new SMState() {
		@Override
		String getName() {
			return "State2";
		}
	};
	public static final SMState End = new SMState() {
		@Override
		String getName() {
			return "End";
		}
	};
}
