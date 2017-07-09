package com.designpattern.proxyoriginal5;

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
		
//		Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class,new TimeHandler());
//		m.move();
		
		Tank t = new Tank();
		InvocationHandler h = new TimeHandler(t);
		Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class,h);
		//当我调用move方法的时候，在生成的代码里会找到方法，然后会调用传经来的h的invoke
		//就是我们的TimeHandler的invoke,就可以自己加逻辑，然后调用原来的对象方法，功能就实现了
		
		//整理一下 8 - 5:48
		//我们现在有一个Tank对象
		//想在Tank对象move方法前后加上自己的一段逻辑 
		//我们首先定义了自己的逻辑TimeHandler,会把Tank对象交给我们的TimeHandler对象
		//
		//好处是可以对任意的对象、任意的接口方法，实现任意的代理
		//接着继续测试proxy.test
		
		//jdk里面newProxyInstance比我们多一个参数classloader，我们写好了URLClassLoader
		////jdk里面InvocationHandler比我们多了方法的参数
		
		//什么叫动态代理
		//动态代理是怎么产生的
	}
	
}
