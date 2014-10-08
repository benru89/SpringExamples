package com.sopra.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String args[]){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		DefaultMessage message=context.getBean("message",DefaultMessage.class);
		System.out.println(message.getMessage());
		context.close();
	}
	
}
