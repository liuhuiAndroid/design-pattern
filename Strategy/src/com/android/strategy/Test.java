package com.android.strategy;

public class Test {

	public static void main(String[] args) {
		
		
		Ticket ticket = new Ticket(200);
		ticket.setDiscount(new GirlDiscount());
		System.out.println("ticket:"+ticket.getPrice());
		
	}
}
