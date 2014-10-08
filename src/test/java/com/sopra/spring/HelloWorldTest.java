package com.sopra.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;


public class HelloWorldTest {
	

	
	private HelloWorld helloWorldBean = null;
	
	@Before
	public void setUp(){
		helloWorldBean = new HelloWorldImpl();
		helloWorldBean.saySomethingElse("HALLO");
	}
	
	@Test
	public void testSetMessage(){
		assertNotNull("Constructor message instance is null.", helloWorldBean);
		String message = helloWorldBean.getMessage();
		assertNotNull("Message is null.", message);
		String expectedMessage = "HALLO";
		assertEquals("Message should be '" + expectedMessage + "'.",expectedMessage,message);
	}
	
	

}
