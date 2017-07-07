package com.designpattern.proxyoriginal;

/**
 * 聚合：一个类里面有另一个类的对象，实现的是同样的接口
 * @author lh
 *
 */
public class TankLogProxy implements Moveable{

	//本来是Tank，改成Moveable发现奇妙的现象
	Moveable t;
	
	public TankLogProxy(Moveable t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		System.out.println("Tank Start...");
		t.move();
		System.out.println("Tank Stop...");
	}

	
	
}
