package com.android.dp.singleton;

//懒汉式单例类与线程锁定
public class LazySingleton {

    // volatile:确保多个线程都能够正确处理
    private volatile static LazySingleton instance = null;

    private LazySingleton() {
    }

    //getInstanceSync调用会进行线程锁定判断,在多线程高并发访问环境中,将会导致系统性能大大降低
    synchronized public static LazySingleton getInstanceSync() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            //只需要锁定代码"instance = new LazySingleton();"
            //如果两个线程同时调用,仍然会产生多个实例
            synchronized (LazySingleton.class) {
                // 双重检查锁定
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
