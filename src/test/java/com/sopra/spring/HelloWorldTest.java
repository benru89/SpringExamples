package com.sopra.spring;


import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;


public class HelloWorldTest {
	
	private HelloWorld helloWorldBean = null;
	
	@Before
	public void setUp(){
		helloWorldBean = new HelloWorldImpl();
	}
	
	@Test
	public void testSetMessage(){
		assertNotNull("Constructor message instance is null.", helloWorldBean);
		String message = helloWorldBean.sayHello();
		assertNotNull("Message is null.", message);
	}
	
	

}
