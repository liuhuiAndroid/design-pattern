package com.designpattern.proxyprinciple;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DAOLogHandler implements InvocationHandler{

	private Object object;
	
	public DAOLogHandler(Object object) {
		super();
		this.object = object;
	}
	
	@Override
	public void invoke(Object o, Method method) {
		beforeInvoke();
		try {
			method.invoke(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		afterInvoke();
	}

	private void beforeInvoke() {
		Calendar calendar = new GregorianCalendar();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		String time = hour + ":" + minute + ":" +second;
		System.out.println("方法调用开始！time = "+time);
	}
	
	private void afterInvoke() {
		System.out.println("方法调用结束！");
	}

}
