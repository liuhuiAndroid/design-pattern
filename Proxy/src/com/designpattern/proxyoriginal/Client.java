package com.designpattern.proxyoriginal;

public class Client {

	public static void main(String[] args) {
		//聚合的好处：
		//代码拷贝一份继续
		Moveable moveable = new Tank();
		TankTimeProxy ttp = new TankTimeProxy(moveable);
		TankLogProxy tlp = new TankLogProxy(ttp);
		tlp.move();
	}
}
