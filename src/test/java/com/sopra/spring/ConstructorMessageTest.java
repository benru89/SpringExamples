package com.sopra.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/applicationContext.xml")
public class ConstructorMessageTest {
	
	@Autowired
	private ConstructorMessage messageBean;
	
	private static String TEXT_TEST = "Spring is not fun!!!";
	
	@Test
	public void testSetMessage(){
		assertEquals("hola",TEXT_TEST,messageBean.getMessage());
	}
	
}
