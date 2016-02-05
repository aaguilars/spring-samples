package com.kapx.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CsvFileWriter implements FileWriter {
	private static final Logger LOGGER = LoggerFactory.getLogger(CsvFileWriter.class);

	@Override
	public void write(final String contents) {
		LOGGER.info("CsvFileWriter :: " + contents);
	}

}