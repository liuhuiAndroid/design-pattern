package com.designpattern.proxyprinciple;

public class UserDAO implements AbstractUserDAO {

	@Override
	public void findUserById() {
		System.out.println("查询ID为" + "X" + "的用户信息成功！");
	}

}
