package com.hzz.statemachine.config.configurers;

import com.hzz.statemachine.listener.SMListener;

public class TransitionConfigurer<S, E, R> {
	private S source;
	private S target;
	private E event;
	private SMListener<R> listener;

	public TransitionConfigurer<S, E, R> source(S source) {
		this.source = source;
		return this;
	}

	public TransitionConfigurer<S, E, R> target(S target) {
		this.target = target;
		return this;
	}

	public TransitionConfigurer<S, E, R> event(E event) {
		this.event = event;
		return this;
	}

	public TransitionConfigurer<S, E, R> listener(SMListener<R> listener) {
		this.listener = listener;
		return this;
	}

	public S getSource() {
		return source;
	}

	public void setSource(S source) {
		this.source = source;
	}

	public S getTarget() {
		return target;
	}

	public void setTarget(S target) {
		this.target = target;
	}

	public E getEvent() {
		return event;
	}

	public void setEvent(E event) {
		this.event = event;
	}

	public SMListener<R> getListener() {
		return listener;
	}

	public void setListener(SMListener<R> listener) {
		this.listener = listener;
	}
}
