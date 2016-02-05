package com.kapx.spring.beans;

import org.springframework.stereotype.Component;

@Component("textFileWriter")
public class TextFileWriter implements FileWriter {
    @Override
    public void write(final String contents) {
        System.out.println("TextFileWriter :: write contents -> " + contents);
    }
}
