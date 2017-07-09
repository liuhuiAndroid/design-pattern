package com.designpattern.proxyoriginal5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//需要实现InvocationHandler
public class TimeHandler implements InvocationHandler{

	//现在我们没有被代理的对象
	//sun要求把被代理的对象写到这里来
	// 需要定义好对哪个对象进行代理
	private Object target; //这是我们的被代理对象

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public void invoke(Object o,Method m){
		System.out.println(""+o.getClass().getName());//其实就是生成的代理类
		//需要加上自己的代理逻辑
		long start = System.currentTimeMillis();
		//除了静态方法，你都是需要知道调用方法的对象是谁，所以invoke内必须得有一个Object参数
		try {
//			m.invoke(o,new Object[]{});
			//需要对被代理对象调用
			m.invoke(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time:"+(end - start));
		
	}

}
