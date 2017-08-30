package com.android.dp.observer;

import java.util.ArrayList;

/**
 * Created by lh on 2017/8/30.
 * 战队控制中心类：目标类
 */
public abstract class AllyControlCenter {

    //战队名称
    protected String allName;

    // 定义一个集合用于存储战队成员
    protected ArrayList<Observer> players = new ArrayList<>();

    public String getAllName() {
        return allName;
    }

    public void setAllName(String allName) {
        this.allName = allName;
    }

    //注册方法
    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allName + "战队！");
        players.add(obs);
    }

    //注销方法
    public void quit(Observer obs){
        System.out.println(obs.getName() + "退出" + this.allName + "战队！");
        players.remove(obs);
    }

    //声明抽象通知方法
    public abstract void notifyObserver(String name);

}
