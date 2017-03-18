package com.designpattern.proxyprinciple;

public class Client {
	public static void main(String[] args) throws Exception {
		InvocationHandler handler = null;
		
		AbstractUserDAO userDAO = new UserDAO();

		handler = new DAOLogHandler(userDAO);
		AbstractUserDAO proxy = null;
		
		proxy = (AbstractUserDAO)Proxy.newProxyInstance(AbstractUserDAO.class,handler);
		proxy.findUserById();
		
		System.out.println("--------------------------------");
		System.out.println("---------------Н¬Ан--------------");
		
		AbstractDocumentDAO documentDAO = new DocumentDAO();
		handler = new DAOLogHandler(documentDAO);
		AbstractDocumentDAO proxy_new = null;
		proxy_new = (AbstractDocumentDAO)Proxy.newProxyInstance(AbstractDocumentDAO.class,handler);
		proxy_new.deleteDocumentById();
	}
}
