/**
 * 
 */
package com.springboot.activemq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @auther Unnati
 */
@Service
public class MessageConsumerService {
	
	@JmsListener(destination = "demoActiveMq")
	public void listener(String name) {
		System.out.println("The name sent from Queue Youtube is " + name);
	}

}
