package com.kapx.spring.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/test/resources/config/spring-context-test.xml")
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
	public void writeContentsToCsvFile() {
		csvFileWriter.write("sample contents");
	}

	@Test
	public void writeContentsToTextFile() {
		textFileWriter.write("sample contents");
	}

	@Test
	public void writeContentsToXmlFile() {
		xmlFileWriter.write("sample contents");
	}

}
