package com.android.dp.facade;

/**
 * Created by lh on 2017/8/23.
 */
public class NewCipherMachine {

    public String encrypt(String plainText) {
        System.out.print("数据加密，将明文转换成密文：");
        String es = "";
        int key = 10;
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            //小写字母移位
            if(c >= 'a' && c<='z'){
                c += key % 26;
                if(c >'z'){
                    c -= 26;
                }
                if(c < 'a'){
                    c += 26;
                }
            }
            es += c;
        }
        System.out.println(es);
        return es;
    }

}
