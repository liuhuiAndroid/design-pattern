package com.designpattern.proxy.test;

import java.lang.reflect.Method;

import com.designpattern.proxyoriginal5.InvocationHandler;

public class TransactionHandler implements InvocationHandler {

	private Object target;
	
	
	public TransactionHandler(Object target) {
		super();
		this.target = target;
	}


	@Override
	public void invoke(Object o, Method m) {
		
		System.out.println("Transaction start .. ");
		try {
			m.invoke(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Transaction commit .. ");
		
	}

}
