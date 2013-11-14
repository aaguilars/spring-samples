package com.kapx.springjms.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.kapx.springjms.producer.MessageProducer;
import com.kapx.springjms.service.MessageService;
import com.kapx.springjms.vo.MessageVO;

public class MessageServiceImpl implements MessageService {

	private static final Logger logger = Logger
			.getLogger(MessageServiceImpl.class);

	@Autowired
	@Qualifier("messageProducer")
	private MessageProducer messageProducer;

	@Override
	public void sendMessage() {
		MessageVO messageVO = new MessageVO("request message from producer");
		logger.debug("invoke message producer to send message...");
		messageProducer.sendMessage(messageVO);
	}

}
