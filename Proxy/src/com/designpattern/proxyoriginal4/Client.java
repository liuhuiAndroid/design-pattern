package com.designpattern.proxyoriginal4;

import java.io.Serializable;

public class Client {

	/**
	 * 现在有一个很严重的问题是：只能生成时间的代理 不能实现比如说权限这种自定义代理
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
