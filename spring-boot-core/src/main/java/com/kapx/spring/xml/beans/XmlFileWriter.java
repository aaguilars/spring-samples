package com.kapx.spring.xml.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlFileWriter implements FileWriter {
    private static final Logger LOGGER = LoggerFactory.getLogger(XmlFileWriter.class);

    @Override
    public void write(String contents) {
        LOGGER.info("------------------- XmlFileWriter::Writing contents [ {} ] -------------------", contents);
    }
}
