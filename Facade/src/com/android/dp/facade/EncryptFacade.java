package com.android.dp.facade;

/**
 * Created by lh on 2017/8/23.
 * 加密外观类：外观类
 */
public class EncryptFacade {

    private FileReader mReader;
    private CipherMachine mCipherMachine;
    private FileWriter mWriter;

    public EncryptFacade() {
        mReader = new FileReader();
        mCipherMachine = new CipherMachine();
        mWriter = new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = mReader.read(fileNameSrc);
        String encryptStr = mCipherMachine.encrypt(plainStr);
        mWriter.write(encryptStr, fileNameDes);
    }

}
