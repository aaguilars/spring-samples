package com.kapx.springframework.factory;

import java.util.Map;

import com.kapx.springframework.beans.Car;
import com.kapx.springframework.enums.CarType;

public class CarFactory {

	private Map<CarType, Car> carTypes;

	public void setCarTypes(Map<CarType, Car> carTypes) {
		this.carTypes = carTypes;
	}

	public Car getCar(CarType carType) {
		return this.carTypes.get(carType);
	}
	
}
