package com.designpattern.proxyoriginal4;

import java.io.Serializable;

public class Client {

	/**
	 * 实现任意接口的动态代理
	 * 需要代理的接口有多少个方法，那么我们就要实现多少个方法
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
//		Moveable moveable = new Tank();
//		Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class);
//		m.move();
		
//		Moveable moveable = new Tank();
//		Moveable m = (Moveable) Proxy.newProxyInstance(Serializable.class);
		
		Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class);
		m.move();
		
	}
	
}
