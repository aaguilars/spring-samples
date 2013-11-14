package com.kapx.springjms.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kapx.springjms.service.MessageService;

public class MessageClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-context/spring-jms-context.xml");

		MessageService messageService = (MessageService) context
				.getBean("messageService");

		messageService.sendMessage();
	}
}
