package com.kapx.spring.xml.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-Test.xml")
public class FileWriterTest {

    @Autowired
    @Qualifier("csvFileWriter")
    private FileWriter csvFileWriter;

    @Autowired
    @Qualifier("textFileWriter")
    private FileWriter textFileWriter;

    @Autowired
    @Qualifier("xmlFileWriter")
    private FileWriter xmlFileWriter;

    @Test
    public void writeCsvContents() throws Exception {
        csvFileWriter.write("Test Contents");
    }

    @Test
    public void writeTextContents() throws Exception {
        textFileWriter.write("Test Contents");
    }

    @Test
    public void writeXmlContents() throws Exception {
        xmlFileWriter.write("Test Contents");
    }
}
