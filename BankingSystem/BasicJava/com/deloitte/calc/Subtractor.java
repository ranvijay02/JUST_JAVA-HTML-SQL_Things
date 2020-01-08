package com.deloitte.calc;

public class Subtractor implements Calculator {

	@Override
	public int calculate(int first, int second) {
		return first - second;
	}

}
