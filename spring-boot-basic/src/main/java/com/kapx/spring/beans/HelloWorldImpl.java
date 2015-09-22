package com.kapx.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello(String arg) {
		if (arg == null || arg.isEmpty()) {
			throw new IllegalArgumentException("Argument must not be null");
		}

		return "Hello ! " + arg;
	}

}
