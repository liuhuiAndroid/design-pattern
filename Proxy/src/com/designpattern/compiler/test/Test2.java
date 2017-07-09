package com.designpattern.compiler.test;

import java.lang.reflect.Method;

/**
 * ≤‚ ‘∑¥…‰
 * @author lh
 *
 */
public class Test2 {

	public static void main(String[] args) {
		Method[] methods = com.designpattern.proxyoriginal4.Moveable.class.getMethods();
		for(Method m :methods){
			System.out.println(m.getName());
		}
	}
	
}
