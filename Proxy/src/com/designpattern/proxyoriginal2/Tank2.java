package com.designpattern.proxyoriginal2;

/**
 * ผฬณะ
 * @author lh
 *
 */
public class Tank2 extends Tank{

	@Override
	public void move() {
		long start = System.currentTimeMillis();
		super.move();
		long end = System.currentTimeMillis();
		System.out.println("time:"+(start - end));
	}
	
}
