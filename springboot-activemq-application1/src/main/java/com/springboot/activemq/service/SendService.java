/**
 * 
 */
package com.springboot.activemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @auther Unnati
 */
@Component
public class SendService {

	
	private JmsTemplate jmsTemplate;
	
	@Autowired
	public SendService(JmsTemplate jmsTemplate) {
		super();
		this.jmsTemplate = jmsTemplate;
	}

	
	
	
	
	public void sendName(String name) {
		jmsTemplate.convertAndSend("demoActiveMq", name);
		
	}
}
