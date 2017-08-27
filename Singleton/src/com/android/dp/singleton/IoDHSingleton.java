package com.android.dp.singleton;

public class IoDHSingleton {

    private IoDHSingleton() {
    }

    //IoDHSingleton静态单例对象没有作为IoDHSingleton的成员变量直接实例化
    private static class HolderClass{
        private final static IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance(){
        return HolderClass.instance;
    }

    public static void main(String args[]){
        IoDHSingleton instance1,instance2;
        instance1 = IoDHSingleton.getInstance();
        instance2 = IoDHSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}
