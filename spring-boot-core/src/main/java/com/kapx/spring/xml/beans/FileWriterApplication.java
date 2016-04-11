package com.kapx.spring.xml.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:applicationContext.xml")
public class FileWriterApplication {
    public static void main(String[] args) {
        final ApplicationContext context = SpringApplication.run(FileWriterApplication.class, args);
        final FileWriter csvFileWriter = (FileWriter) context.getBean("csvFileWriter");
        csvFileWriter.write("Sample Text");

        final FileWriter textFileWriter = (FileWriter) context.getBean("textFileWriter");
        textFileWriter.write("Sample Text");

        final FileWriter xmlFileWriter = (FileWriter) context.getBean("xmlFileWriter");
        xmlFileWriter.write("Sample Text");
    }
}
