package com.designpattern.proxyoriginal3;

public class Client {

	/**
	 * 先看compiler.test测试一下
	 * @param args
	 */
	public static void main(String[] args) {
		Moveable moveable = new Tank();
		Moveable m = (Moveable) Proxy.newProxyInstance();
		m.move();
	}
}
