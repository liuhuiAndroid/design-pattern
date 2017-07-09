package com.designpattern.proxyoriginal5;

import java.lang.reflect.Method;

/**
 * 调用的处理器
 * @author lh
 *
 */
public interface InvocationHandler {
	
	// 用于处理方法的调用
	public void invoke(Object o,Method m);
	
}
