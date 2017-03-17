package com.android.strategy;

public class StudentDiscount implements Discount{

	@Override
	public double calculate(double price) {
		return price*0.8;
	}

}
