package com.learner.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learner.spring.annotationbased.Profile;
import com.learner.spring.annotationbased.Student;
import com.learner.spring.annotationbased.WysiwygEditor;

/**
 * Sample spring bean loader app
 * 
 * @author Jaison
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj.getMessage());

		SpringJavaCollection sjc = (SpringJavaCollection) context.getBean("springJavaCollection");
		sjc.getAddressList();
		sjc.getAddressSet();
		sjc.getAddressMap();
		sjc.getAddressProp();

		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		textEditor.getSpellChecker().checkSpelling();

		GrammerEditor grammerEditor = (GrammerEditor) context.getBean("grammerEditor");
		grammerEditor.getGrammerChekcer().checkGrammer();

		ParagraphEditor paragraphEditor = (ParagraphEditor) context.getBean("paragraphEditor");
		paragraphEditor.getParagraphChecker().checkParagraph();
		
		// Annotation based bean examples
		// @Required example
		Student student = (Student) context.getBean("student");
		System.out.println("Student name is " + student.getName());
		System.out.println("Student age is " + student.getAge());
		
		// @Autowired example
		WysiwygEditor wysiwygEditor = (WysiwygEditor) context.getBean("wysiwygEditor");
		wysiwygEditor.initiateWysiwyg();
		
		// Qualifier
		Profile profile = (Profile) context.getBean("profile");
		profile.printProfile();
		
		context.registerShutdownHook();
		
	}
}
