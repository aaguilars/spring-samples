package com.kapx.spring3kickstart.factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kapx.springframework.beans.Car;
import com.kapx.springframework.enums.CarType;
import com.kapx.springframework.factory.CarFactory;

public class CarFactoryTest {

	private ApplicationContext applicationContext;

	@Test
	public void test() {
		try {
            applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
             
            CarFactory carFactory = applicationContext.getBean(CarFactory.class);
            Car car = carFactory.getCar(CarType.BMW);
            System.out.println(car.getName());
            
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
