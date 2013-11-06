package com.kapx.springframework.beans.impl;

import com.kapx.springframework.beans.Car;

public class Audi implements Car {

	@Override
	public String getName() {
		return "Audi";
	}

}
