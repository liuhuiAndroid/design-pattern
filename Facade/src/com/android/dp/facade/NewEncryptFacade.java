package com.android.dp.facade;

/**
 * Created by lh on 2017/8/23.
 * 新加密外观类：具体外观类
 */
public class NewEncryptFacade extends AbstractEncryptFacade {
    private FileReader mReader;
    private NewCipherMachine mNewCipherMachine;
    private FileWriter mWriter;

    public NewEncryptFacade() {
        mReader = new FileReader();
        mNewCipherMachine = new NewCipherMachine();
        mWriter = new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = mReader.read(fileNameSrc);
        String encryptStr = mNewCipherMachine.encrypt(plainStr);
        mWriter.write(encryptStr, fileNameDes);
    }

}