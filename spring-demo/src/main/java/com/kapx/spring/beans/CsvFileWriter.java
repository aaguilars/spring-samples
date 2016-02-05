package com.kapx.spring.beans;

import org.springframework.stereotype.Component;

@Component("csvFileWriter")
public class CsvFileWriter implements FileWriter {
    @Override
    public void write(final String contents) {
        System.out.println("CsvFileWriter :: write contents -> " + contents);
    }
}
