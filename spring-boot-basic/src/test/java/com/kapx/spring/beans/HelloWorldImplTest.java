package com.kapx.spring.beans;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/test/resources/config/spring-context-test.xml")
public class HelloWorldImplTest {

	@Autowired
	private HelloWorld helloWorld;

	@Test(expected = IllegalArgumentException.class)
	public void sayHello_withNullArgument_throwsIllegalArgumentException() {
		helloWorld.sayHello(null);
	}

	@Test
	public void sayHello_withCorrectArgument_throwsCorrectOutput() {
		final String actual = helloWorld.sayHello("Kapx");
		Assert.assertEquals("Hello ! Kapx", actual);
	}
}
