package com.sopra.spring.app;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MessageRunner {

	final public static Logger log = LogManager.getLogger(MessageRunner.class);
	
	public static void main(String args[]){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		Message message = (Message) context.getBean("message");
		log.info("message='" + message.getMessage() + "'");
		context.close();
	}
	
}
