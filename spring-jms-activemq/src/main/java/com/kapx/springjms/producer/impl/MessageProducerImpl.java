package com.kapx.springjms.producer.impl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.kapx.springjms.producer.MessageProducer;
import com.kapx.springjms.vo.MessageVO;

public class MessageProducerImpl implements MessageProducer {
	private static final Logger logger = Logger
			.getLogger(MessageProducerImpl.class);

	@Autowired
	private JmsTemplate jmsTemplate;

	public void sendMessage(final MessageVO messageVO) {
		jmsTemplate.send(new MessageCreator() {

			@Override
			public Message createMessage(Session session) throws JMSException {
				ObjectMessage objectMessage = session
						.createObjectMessage(messageVO);
				logger.debug("create and return object message");
				return objectMessage;
			}
		});
	}
}
