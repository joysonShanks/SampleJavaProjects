package com.learner.spring.javabeanconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learner.spring.HelloWorld;
import com.learner.spring.TextEditor;

public class JavaSpringConfigMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldSpring.class, InjectingBeans.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

		helloWorld.setMessage("This is the message from java spring config");
		System.out.println(helloWorld.getMessage());

		TextEditor textEditor = ctx.getBean(TextEditor.class);
		textEditor.getSpellChecker().checkSpelling();
		/**
		 * AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		 * 
		 * @Configuration annotated classes
		 * ctx.register(AppConfig.class, OtherConfig.class); 
		 * ctx.register(AdditionalConfig.class); 
		 * ctx.refresh();
		 * 
		 * MyService myService = ctx.getBean(MyService.class);
		 * myService.doStuff();
		 */
		
		// We can use @Import on top of class to import config from other classes.
		// Instead of passing multiple classes to AnnotationConfigApplicationContext you can pass only one class.
		/**
		 @Configuration
		 public class ConfigA {
   		 	@Bean
   		 	public A a() {
      			return new A(); 
   		 	}
		 }
		 
		 @Configuration
		 @Import(ConfigA.class)
		 public class ConfigB {
		 	@Bean
		   	public B a() {
		      	return new A(); 
		   	}
		 }
		 
		 
		public static void main(String[] args) {
			ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);
			
			// now both beans A and B will be available...
			A a = ctx.getBean(A.class);
			B b = ctx.getBean(B.class);
		}
	   
		public class Foo {
		   public void init() {
		      // initialization logic
		   }
		   public void cleanup() {
		      // destruction logic
		   }
		}
		@Configuration
		public class AppConfig {
		   @Bean(initMethod = "init", destroyMethod = "cleanup" )
		   public Foo foo() {
		      return new Foo();
		   }
		}
			**/
	}
	

}
