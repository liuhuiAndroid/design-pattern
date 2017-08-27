package com.android.dp.singleton;

//饿汉式单例类
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
