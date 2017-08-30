package com.android.dp.cor;

/**
 * Created by lh on 2017/8/30.
 */
public class Client {

    public static void main(String args[]) {
        Approver wjzhang, gyang, jguo, meeting;
        wjzhang = new Director("张无忌");
        gyang = new VicePresident("杨过");
        jguo = new President("郭靖");
        meeting = new Congress("董事会");

        //创建职责链
        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        PurchaseRequest pr1 = new PurchaseRequest(4500, 10001, "购买剑");
        PurchaseRequest pr2 = new PurchaseRequest(65000, 10002, "购买刀");
        PurchaseRequest pr3 = new PurchaseRequest(165500, 10003, "购买书籍");
        PurchaseRequest pr4 = new PurchaseRequest(804500, 10004, "购买岛屿");

        wjzhang.processRequest(pr1);
        wjzhang.processRequest(pr2);
        wjzhang.processRequest(pr3);
        wjzhang.processRequest(pr4);
    }

}
