package com.hzz.statemachine.listener;

import com.hzz.statemachine.context.SMContext;

public interface SMListener<T> {
	T listen(SMContext context);
}
