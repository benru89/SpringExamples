package com.sopra.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String args[]){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		SetterMessage message=context.getBean("message",SetterMessage.class);
		System.out.println(message.getMessage());
		context.close();
	}
	
}
