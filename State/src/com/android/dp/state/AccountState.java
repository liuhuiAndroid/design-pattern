package com.android.dp.state;

/**
 * Created by lh on 2017/8/28.
 * 抽象状态角色
 */
public abstract class AccountState {

    protected Account acc;

    //声明抽象业务方法，不同的具体状态类可以不同的方法实现
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void computeInterest();

    public abstract void stateCheck();

}
