package com.sopra.spring.xml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

/**
 * <p>Tests default messsage.</p>
 */
@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ConstructorMessageTest {

	final public static Logger log = LogManager.getLogger(ConstructorMessageTest.class);

    @Autowired
    private ConstructorMessage message = null;

    /**
     * Tests message.
     */
    @Test
    public void testMessage() {   
        assertNotNull("Constructor message instance is null.", message);
        
        String msg = message.getMessage();
        
        assertNotNull("Message is null.", msg);
        
        String expectedMessage = "spring is Funn";
        
        assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);

        log.info("message='{}'" + msg);
    }
    
}
