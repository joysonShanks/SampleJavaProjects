package com.learner.spring.aop.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {

	@Pointcut("execution(* com.learner.spring.aop.aspectj.*.*(..))")
	public void selectAll() {}
	
	@Before("selectAll()")
	public void beforeAdvice() {
		System.out.println("Method was called before advice !!");
	}
	
	@After("selectAll()")
	public void afterAdvice() {
		System.out.println("Method was called after advice !!");
	}
	
	@AfterReturning(pointcut = "selectAll()", returning="retVal")
	public void afterReturning(Object retVal) {
		System.out.println("Method was called after returning value is = " + retVal.toString());
	}
	
	@AfterThrowing(pointcut = "selectAll()", throwing = "ex")
	public void afterThrowing(IllegalArgumentException ex) {
		System.out.println("Method was called after excetpion has been thrown " + ex.toString());
	}
}
