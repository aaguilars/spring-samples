package com.kapx.springjms.listener.impl;

import org.apache.log4j.Logger;

import com.kapx.springjms.listener.MessageListener;
import com.kapx.springjms.vo.MessageVO;

public class MessageListenerImpl implements MessageListener {
	private static final Logger logger = Logger
			.getLogger(MessageListenerImpl.class);

	public void onMessage(MessageVO messageVO) throws Exception {
		logger.debug("message received..." + messageVO.getMessage());
		System.out.println(messageVO.getMessage());
	}
}
