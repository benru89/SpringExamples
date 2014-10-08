package com.sopra.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DefautlMessageTest {

	private DefaultMessage messageTest = null;
	
	private static String TEXT_TEST = "TESTING STRING";
	
	@Test
	public void testSetMessage(){
		assertEquals(TEXT_TEST,messageTest.getMessage());
	}
	
	@Before
	public void setup(){
		messageTest = new DefaultMessage();
		messageTest.setMessage(TEXT_TEST);
	}
}
