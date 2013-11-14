package com.kapx.springjms.producer;

import com.kapx.springjms.vo.MessageVO;

public interface MessageProducer {
	void sendMessage(final MessageVO messageVO);
}
