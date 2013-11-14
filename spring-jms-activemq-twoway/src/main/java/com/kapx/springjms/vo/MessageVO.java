package com.kapx.springjms.vo;

import java.io.Serializable;

public class MessageVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String message;

	public MessageVO(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
