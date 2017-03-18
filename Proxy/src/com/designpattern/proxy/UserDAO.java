package com.designpattern.proxy;

public class UserDAO implements AbstractUserDAO{

	@Override
	public boolean findUserById(String userId) {
		if(userId.equals("张伟")){
			System.out.println("查询ID为"+userId+"的用户信息成功！");
			return true;
		}else{
			System.out.println("查询ID为"+userId+"的用户信息失败！");
			return false;
		}
	}

}
