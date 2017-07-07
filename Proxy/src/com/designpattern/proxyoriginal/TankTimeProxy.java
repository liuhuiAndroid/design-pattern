package com.designpattern.proxyoriginal;

/**
 * 聚合：一个类里面有另一个类的对象，实现的是同样的接口
 * @author lh
 *
 */
public class TankTimeProxy implements Moveable{

	//本来是Tank，改成Moveable发现奇妙的现象
	Moveable t;
	
	public TankTimeProxy(Moveable t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		long start = System.currentTimeMillis();
		t.move();
		long end = System.currentTimeMillis();
		System.out.println("time:"+(end - start));
	}

	
	
}
