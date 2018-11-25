package com.learner.spring.events;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvents>{

	public void onApplicationEvent(CustomEvents customEvent) {
		System.out.println(customEvent.toString());
	}

}
