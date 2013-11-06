package com.kapx.springframework.beans.impl;

import com.kapx.springframework.beans.Car;

public class BMW implements Car {

	@Override
	public String getName() {
		return "BMW";
	}

}
