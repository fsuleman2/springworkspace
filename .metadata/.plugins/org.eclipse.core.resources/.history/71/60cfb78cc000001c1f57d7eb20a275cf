package com.revature.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.config.PlayerMainBeanConfig;
import com.revature.model.Player;

public class PlayerMain {

	
	public static void main(String[] args) {
		//adding dependencies in pom.xml Spring Context » 5.3.9
		//ApplicationContext is an interface and container
		//ClassPathXmlApplicationContext is a class with accept config file
//	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	ApplicationContext ac = new AnnotationConfigApplicationContext(PlayerMainBeanConfig.class);
//	Player playerObj1 = ac.getBean("p",Player.class);
	Player player1 = ac.getBean("p1",Player.class);
	//method name in PlayerMainBeanConfig will become the object here
	System.out.println(player1);
//	second way
	Player player2 = ac.getBean("secondPlayer",Player.class);
	//method name in PlayerMainBeanConfig will become the object here
	System.out.println(player2);
	
	
	
	
	
	
	
	
	}

}
