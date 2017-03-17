package com.android.strategy;

public class ChildDiscount implements Discount{

	@Override
	public double calculate(double price) {
		return 0;
	}

}
