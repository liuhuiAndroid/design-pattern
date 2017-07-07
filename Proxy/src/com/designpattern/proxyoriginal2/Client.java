package com.designpattern.proxyoriginal2;

public class Client {

	public static void main(String[] args) {
		//聚合的好处：
		//现在想对任何的类都可以代理，代码见3
		Moveable moveable = new Tank();
		TankTimeProxy ttp = new TankTimeProxy(moveable);
		ttp.move();
	}
}
