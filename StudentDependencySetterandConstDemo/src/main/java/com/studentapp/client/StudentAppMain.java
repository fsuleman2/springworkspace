package com.studentapp.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.studentapp.model.Student;



public class StudentAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Student s=ac.getBean("studentObj",Student.class);
		s.dispStudentDetails();
	}

}
