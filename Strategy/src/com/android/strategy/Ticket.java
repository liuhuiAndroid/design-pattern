package com.android.strategy;

public class Ticket {

	private double price;//¼Û¸ñ
	private Discount discount;
	
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public Ticket(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return this.calculate();
	}
	
	public double calculate(){
		return discount.calculate(price);
	}
	
}
