package com.learner.spring.events;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEventMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext  ctx = new AnnotationConfigApplicationContext(BeanEventConfig.class);
		ctx.start();
		EventHelloWorld eventHelloWorld = ctx.getBean(EventHelloWorld.class);
		System.out.println(eventHelloWorld.getMessage());
		
		// Custom event bean
		CustomEventPublisher publisher = ctx.getBean(CustomEventPublisher.class);
		
		// Publishing the events
		publisher.publish();
		publisher.publish();
		
		ctx.stop();
	}

}
