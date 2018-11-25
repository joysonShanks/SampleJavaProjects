package com.learner.spring.javabeanconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learner.spring.HelloWorld;

/**
 * 
 * @author Jaison
 *
 *
 *         Annotating a class with the @Configuration indicates that the class
 *         can be used by the Spring IoC container as a source of bean
 *         definitions.
 * 
 *         The @Bean annotation tells Spring that a method annotated with @Bean
 *         will return an object that should be registered as a bean in the
 *         Spring application context.
 */
@Configuration
public class HelloWorldSpring {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
