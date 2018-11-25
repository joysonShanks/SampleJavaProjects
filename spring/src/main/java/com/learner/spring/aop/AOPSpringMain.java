package com.learner.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPSpringMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		AOPStudent student = (AOPStudent) context.getBean("aopStudent");
		student.getName();
		student.getAge();
		student.printThrowException();
	}

}
