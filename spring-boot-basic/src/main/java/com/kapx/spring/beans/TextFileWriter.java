package com.kapx.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextFileWriter implements FileWriter {
	private static final Logger LOGGER = LoggerFactory.getLogger(TextFileWriter.class);

	@Override
	public void write(String contents) {
		LOGGER.info("TextFileWriter :: " + contents);
	}

}
