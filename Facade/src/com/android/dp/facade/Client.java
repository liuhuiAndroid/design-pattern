package com.android.dp.facade;

/**
 * Created by lh on 2017/8/23.
 * 客户端测试代码
 */
public class Client {

    public static void main(String args[]) {
        // 外观类测试
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("../Facade/src/com/android/dp/facade/src.txt",
                "../Facade/src/com/android/dp/facade/des.txt");

        // 抽象外观类测试
        AbstractEncryptFacade nef = new NewEncryptFacade();
        nef.fileEncrypt("../Facade/src/com/android/dp/facade/src.txt",
                "../Facade/src/com/android/dp/facade/des.txt");
    }

}
