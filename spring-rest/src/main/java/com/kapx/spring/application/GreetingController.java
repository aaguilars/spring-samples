package com.kapx.spring.application;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final Logger LOG = LoggerFactory.getLogger(GreetingController.class);

    @Autowired
    @Qualifier("greetService")
    private GreetService greetService;


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") final String name) {
        LOG.info("controller invoked with {} parameter", name);
        return greetService.greeting(name);
    }
}
