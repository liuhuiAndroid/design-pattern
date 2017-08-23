package com.android.dp.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lh on 2017/8/23.
 * 文件保存类：子系统类
 */
public class FileWriter {

    public void write(String encryptStr,String fileNameDes){
        System.out.println("保存密文，写入文件。");
        try {
            FileOutputStream outFS = new FileOutputStream(fileNameDes);
            outFS.write(encryptStr.getBytes());
            outFS.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件不存在！");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件操作错误！");
        }

    }

}
