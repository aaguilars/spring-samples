package com.kapx.spring.service;

import com.kapx.spring.application.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service("greetService")
public class GreetServiceImpl implements GreetService {
    private static final Logger LOG = LoggerFactory.getLogger(GreetServiceImpl.class);

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting greeting(String name) {
        LOG.info("service invoked with {} parameter", name);
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
