package com.kapx.springjms.listener;

import com.kapx.springjms.vo.MessageVO;

public interface MessageListener {
	void onMessage(MessageVO messageVO) throws Exception;
}
