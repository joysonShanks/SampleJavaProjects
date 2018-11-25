package com.learner.spring.events;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanEventConfig {

	@Bean
	public EventHelloWorld getHelloWorldSpring() {
		EventHelloWorld eventHelloWorld = new EventHelloWorld();
		eventHelloWorld.setMessage("Hello There !!");
		return eventHelloWorld;
	}

	@Bean
	public CStartEventHandler getcStartEventHandler() {
		return new CStartEventHandler();
	}

	@Bean
	public CStopEventHandler getcStopEventHandler() {
		return new CStopEventHandler();
	}
	
	@Bean
	public CustomEventHandler getCustomEventHandler() {
		return new CustomEventHandler();
	}
	
	@Bean
	public CustomEventPublisher getCustomEventPublisher() {
		return new CustomEventPublisher();
	}
}
