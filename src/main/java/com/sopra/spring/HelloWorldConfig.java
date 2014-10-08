package com.sopra.spring;


import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldConfig {
	
	@Bean(initMethod = "init", destroyMethod = "cleanup")
	//@Scope("prototype")
	@Scope("singleton")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}

	@Bean
	public Logger log()
	{
		return Logger.getLogger(App.class);
	}
	
}
