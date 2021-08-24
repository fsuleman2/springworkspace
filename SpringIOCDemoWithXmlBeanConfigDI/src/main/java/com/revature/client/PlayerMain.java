package com.revature.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.model.Player;

public class PlayerMain {

	
	public static void main(String[] args) {
		//adding dependencies in pom.xml Spring Context » 5.3.9
		//ApplicationContext is an interface and container
		//ClassPathXmlApplicationContext is a class with accept config file
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	//ac.getBean() is an method from AC and take args as class name which we want object
	Player playerObj1 = ac.getBean("p",Player.class);
	Player playerObj2 = ac.getBean("p1",Player.class);
	System.out.println(playerObj1);
	System.out.println(playerObj2);
	
	
	
	
	
	
	
	
	
	}

}
