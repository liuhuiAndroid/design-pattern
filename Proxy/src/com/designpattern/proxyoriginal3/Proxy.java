package com.designpattern.proxyoriginal3;

public class Proxy {

	/**
	 * 用来产生新的代理类
	 * 实现了TankTimeProxy的代理对象
	 * 由于Proxy的存在，TankTimeProxy可以动态生成了，所以废弃。
	 * @return
	 */
	public static Object newProxyInstance(){ //JDK1.6 Complier API,CGLib, ASM
		String src = 
		"package com.designpattern.proxyoriginal3;"+
		"public class TankTimeProxy implements Moveable{"+
				
			"Moveable t;"+
		
			"public TankTimeProxy(Moveable t) {"+
				"super();"+
				"this.t = t;"+
			"}"+
				
			"@Override"+
			"public void move() {"+
				"long start = System.currentTimeMillis();"+
				"t.move();"+
				"long end = System.currentTimeMillis();"+
				"System.out.println(\"time:\"+(end - start));"+
			"}"+
				
		"}";
			
		return null;
		
	}
}
