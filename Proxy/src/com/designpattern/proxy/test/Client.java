package com.designpattern.proxy.test;

import com.designpattern.proxyoriginal5.Proxy;
import com.designpattern.proxyoriginal5.TimeHandler;
import com.designpattern.proxyoriginal5.InvocationHandler;

public class Client {
	
	public static void main(String[] args) throws Exception {
		UserMgr mgr = new UserMgrImpl();
		InvocationHandler h =new TransactionHandler(mgr);
		TimeHandler timeHandler = new TimeHandler(h);
		//¿Éµþ¼Ó
		UserMgr u = (UserMgr)Proxy.newProxyInstance(UserMgr.class,timeHandler);
		u.addUser();
	}
	
}
