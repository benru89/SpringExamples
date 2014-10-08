package com.sopra.spring;


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
		log.info("Mensaje : " + message.sayHello());
		log.info("Mensaje : " + message.saySomethingElse("Spriiing 222"));
		
		HelloWorld message2= context.getBean(HelloWorld.class);		
		log.info("Mensaje : " + message2.sayHello());
		
		
		context.close();
		log.info("Context cerrado");
	}
	
}
