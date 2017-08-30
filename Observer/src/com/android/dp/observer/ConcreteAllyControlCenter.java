package com.android.dp.observer;

/**
 * Created by lh on 2017/8/30.
 * 具体战队控制中心类：具体目标类
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("-----------------");
        this.allName = allyName;
    }

    //实现通知方法
    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
        //遍历观察者集合，调用每一个盟友（自己除外）的支援方法
        for (Observer obs : players) {
            if (!obs.getName().equalsIgnoreCase(name)) {
                obs.help();
            }
        }
    }

}
