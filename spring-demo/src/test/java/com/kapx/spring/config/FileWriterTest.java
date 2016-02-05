package com.kapx.spring.config;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.kapx.spring.beans.CsvFileWriter;
import com.kapx.spring.beans.FileWriter;
import com.kapx.spring.beans.TextFileWriter;
import com.kapx.spring.beans.XmlFileWriter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = FileWriterConfig.class)
public class FileWriterTest {
    @Autowired
    private FileWriter csvFileWriter;

    @Autowired
    private FileWriter textFileWriter;

    @Autowired
    private FileWriter xmlFileWriter;

    @Test
    public void verifyCsvFileWriterInstance() {
        assertNotNull(csvFileWriter);
        assertTrue(csvFileWriter instanceof CsvFileWriter);
    }

    @Test
    public void verifyTextFileWriterInstance() {
        assertNotNull(textFileWriter);
        assertTrue(textFileWriter instanceof TextFileWriter);
    }

    @Test
    public void verifyXmlFileWriterInstance() {
        assertNotNull(xmlFileWriter);
        assertTrue(xmlFileWriter instanceof XmlFileWriter);
    }
}
