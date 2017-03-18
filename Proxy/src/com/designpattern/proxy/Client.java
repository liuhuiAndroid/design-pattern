package com.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Client {
	public static void main(String[] args) {
		InvocationHandler handler = null;
		
		AbstractUserDAO userDAO = new UserDAO();

		handler = new DAOLogHandler(userDAO);
		AbstractUserDAO proxy = null;
		
		//Proxy.newProxyInstance用于返回一个动态创建的代理类的实例
		//参数一：代理类的类加载器    参数二:代理类所实现接口的方法    参数三：所指派的调用处理程序类
		proxy = (AbstractUserDAO)Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(),
				new Class[]{AbstractUserDAO.class},handler);
		proxy.findUserById("张伟");
		
		System.out.println("--------------------------------");
		System.out.println("---------------同理--------------");
		
		AbstractDocumentDAO documentDAO = new DocumentDAO();
		handler = new DAOLogHandler(documentDAO);
		AbstractDocumentDAO proxy_new = null;
		proxy_new = (AbstractDocumentDAO)Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(),
				new Class[]{AbstractDocumentDAO.class},handler);
		proxy_new.deleteDocumentById("设计模式的艺术");
	}
}
