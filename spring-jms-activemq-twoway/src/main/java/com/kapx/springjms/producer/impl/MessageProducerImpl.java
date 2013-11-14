package com.kapx.springjms.producer.impl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.kapx.springjms.listener.MessageListener;
import com.kapx.springjms.producer.MessageProducer;
import com.kapx.springjms.vo.MessageVO;

public class MessageProducerImpl implements MessageProducer, MessageListener {

	private static final Logger logger = Logger
			.getLogger(MessageProducerImpl.class);

	@Autowired
	@Qualifier("jmsTemplateInQueue")
	private JmsTemplate jmsTemplate;

	@Override
	public void sendMessage(final MessageVO messageVO) {
		jmsTemplate.send(new MessageCreator() {

			@Override
			public Message createMessage(Session session) throws JMSException {
				ObjectMessage objectMessage = session
						.createObjectMessage(messageVO);
				objectMessage.acknowledge();
				logger.debug("create and return object message");
				return objectMessage;
			}
		});
	}

	@Override
	public void onMessage(MessageVO messageVO) throws Exception {
		logger.debug("message received..." + messageVO.getMessage());
		System.out.println(messageVO.getMessage());
	}
}
