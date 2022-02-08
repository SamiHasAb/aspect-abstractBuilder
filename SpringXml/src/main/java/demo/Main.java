package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//calling a bean by type class
		Staff doctor = context.getBean(Doctor.class);
		doctor.assist();
		
		Staff nurse = context.getBean(Nurse.class);
		nurse.assist();
		
		
		//calling a bean by id
		
		Doctor doc = (Doctor)context.getBean("doctor");
		doc.assist();
		System.out.println(doc.getGender());
		System.out.println(doc.getQualification());

	}

}
