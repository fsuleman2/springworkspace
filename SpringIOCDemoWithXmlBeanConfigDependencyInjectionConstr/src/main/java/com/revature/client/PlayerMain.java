package com.revature.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.model.Accounts;

public class PlayerMain {

	
	public static void main(String[] args) {
		//adding dependencies in pom.xml Spring Context � 5.3.9
		//ApplicationContext is an interface and container
		//ClassPathXmlApplicationContext is a class with accept config file
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	Accounts a1=ac.getBean("accountsObj",Accounts.class);
	
	a1.showAccounts();
	
	
	
	
	
	
	
	}

}
