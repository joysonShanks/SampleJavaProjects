package com.learner.spring.aop.aspectj;

public class Student {
	private Integer age;
	private String name;

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		System.out.println("AOP class Age : " + age);
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println("AOP class Name : " + name);
		return name;
	}

	public void printThrowException() {
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}
}
