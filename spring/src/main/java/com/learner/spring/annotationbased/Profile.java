package com.learner.spring.annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.*;

public class Profile {

	@Autowired
	@Qualifier(value = "student1")
	private Student student;

	public Profile() {
		System.out.println("Profile constructor was called !!");
	}

	public void printProfile() {
		System.out.println("Student 1 name is " + student.getName());
		System.out.println("Student 1 age is " + student.getAge());
	}

	/** JSR 250 annotations **/
	@PostConstruct
	public void init() {
		System.out.println("Bean profile is going through init.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bean profile will destroy now.");
	}

	// @Resource can also be used in fields or on top of setter methods
	/**
	 * 
	 * @Resource(name = "spellChecker") 
	 * public void setSpellChecker( SpellChecker spellChecker ){ this.spellChecker = spellChecker; } here it takes bean property name
	 *  in case of field it take field name
	 */
}
