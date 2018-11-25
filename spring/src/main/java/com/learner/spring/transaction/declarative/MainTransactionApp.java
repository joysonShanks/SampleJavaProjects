package com.learner.spring.transaction.declarative;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTransactionApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		/*StudentDAO studentJDBCTemplate = (StudentDAO) context.getBean("studentJDBCTemplateTransactionDec");

		System.out.println("------Records creation--------");
		studentJDBCTemplate.create("Zara_dec", 11, 99, 2010);
		studentJDBCTemplate.create("Nuha_dec", 20, 97, 2010);
		studentJDBCTemplate.create("Ayan_dec", 25, 100, 2011);

		System.out.println("------Listing all the records--------");
		List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();

		for (StudentMarks record : studentMarks) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.print(", Marks : " + record.getMarks());
			System.out.print(", Year : " + record.getYear());
			System.out.println(", Age : " + record.getAge());
		}*/
		StudentDAO studentTransAnnotationDriven = (StudentDAO) context.getBean("studentTransAnnotationDriven");
		System.out.println("------Records creation--------");
		studentTransAnnotationDriven.create("Zara_dec", 11, 99, 2010);
		studentTransAnnotationDriven.create("Nuha_dec", 20, 97, 2010);
		studentTransAnnotationDriven.create("Ayan_dec", 25, 100, 2011);

		System.out.println("------Listing all the records--------");
		List<StudentMarks> studentMarks = studentTransAnnotationDriven.listStudents();

		for (StudentMarks record : studentMarks) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.print(", Marks : " + record.getMarks());
			System.out.print(", Year : " + record.getYear());
			System.out.println(", Age : " + record.getAge());
		}
	}

}
