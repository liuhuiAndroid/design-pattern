package com.designpattern.proxyoriginal3;

import java.util.Random;

public class Tank implements Moveable{

	@Override
	public void move() {
		
		System.out.println("Tank Moving...");
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
