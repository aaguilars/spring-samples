package com.kapx.spring.batch.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.listener.ItemListenerSupport;
import org.springframework.stereotype.Component;

@SuppressWarnings("rawtypes")
@Component("failureLoggerListener")
public class ContactFailureLoggerListener extends ItemListenerSupport {
	private static final Logger logger = LoggerFactory.getLogger(ContactFailureLoggerListener.class);

	public void onReadError(Exception ex) {
		logger.error("Encountered error on read.", ex);
	}

	public void onWriteError(Exception ex, Object item) {
		logger.error("Encountered error on write.", ex);
	}
}
