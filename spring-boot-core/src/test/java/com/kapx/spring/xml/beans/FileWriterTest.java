package com.kapx.spring.xml.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class FileWriterTest {

    @Autowired
    @Qualifier("csvFileWriter")
    private FileWriter csvFileWriter;

    @Autowired
    @Qualifier("csvFileWriter")
    private FileWriter csvFileWriter;

    @Autowired
    @Qualifier("csvFileWriter")
    private FileWriter csvFileWriter;

    @Test
    public void writeCsvContents() throws Exception {
        csvFileWriter.write("Test Contents");
    }
}
