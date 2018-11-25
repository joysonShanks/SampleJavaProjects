package com.learner.spring.aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Student student = (Student) context.getBean("studentAspect");
		System.out.println("AOP class version started !!");
		student.getName();
		student.getAge();

		student.printThrowException();
	}

}
