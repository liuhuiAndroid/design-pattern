package com.android.strategy;

public class GirlDiscount implements Discount{

	@Override
	public double calculate(double price) {
		return 88;
	}

}
