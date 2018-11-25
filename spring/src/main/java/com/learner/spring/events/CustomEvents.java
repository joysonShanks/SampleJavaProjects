package com.learner.spring.events;

import org.springframework.context.ApplicationEvent;

public class CustomEvents extends ApplicationEvent {
	private static final long serialVersionUID = 8853753304192718047L;

	public CustomEvents(Object source) {
		super(source);
	}
	
	public String toString() {
		return "My cusom event !!";
	}
}
