package com.sopra.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml","file:src/main/resources/applicationContext.xml"})
public class SetterMessageTest {
	final Logger log = LogManager.getLogger(SetterMessageTest.class);
	
	@Autowired
	private SetterMessage message;
	
	@Test
	public void testSetMessage(){
		assertNotNull("Constructor message instance is null.", message);
		String msg = message.getMessage();
		assertNotNull("Message is null.", msg);
		String expectedMessage = "Hola que tal!!!";
		assertEquals("Message should be '" + expectedMessage + "'.",expectedMessage,msg);
		log.info("message='{"+msg+"}'");
	}
	

}
