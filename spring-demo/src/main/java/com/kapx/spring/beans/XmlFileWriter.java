package com.kapx.spring.beans;

import org.springframework.stereotype.Component;

@Component("xmlFileWriter")
public class XmlFileWriter implements FileWriter {
    @Override
    public void write(final String contents) {
        System.out.println("XmlFileWriter :: write contents -> " + contents);
    }
}
