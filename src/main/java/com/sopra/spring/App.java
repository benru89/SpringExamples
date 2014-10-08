package com.sopra.spring;


import java.util.Locale;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static Logger log = LogManager.getLogger(App.class);
	
	public static void main(String args[]){
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.registerShutdownHook();
		context.register(HelloWorldConfig.class);
		context.refresh();
		
		HelloWorld message= context.getBean(HelloWorld.class);		
		Object[] name = new Object[]{"Mickey Mouse"};
		
		log.info("Mensaje : " + message.sayHello());
		log.info("Mensaje : " + message.sayWelcome(name));
		
		Locale.setDefault(Locale.FRANCE);		

		log.info("Mensaje : " + message.sayHello());
		log.info("Mensaje : " + message.sayWelcome(name));
		
		Locale.setDefault(Locale.ENGLISH);

		log.info("Mensaje : " + message.sayHello());
		log.info("Mensaje : " + message.sayWelcome(name));
		
		context.close();
		log.info("Context cerrado");
	}
	
}
