package com.kapx.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.kapx.spring.beans"})
public class FileWriterConfig {
}