package com.android.dp.builder;

/**
 * Created by lh on 2017/8/24.
 */
public class Client {

    public static void main(String args[]) {

        //实例化指挥者类
        ActorController actorController = new ActorController();
        //指挥者类针对抽象建造者编程
        Actor actor = actorController.construct(new AngelBuilder());

        System.out.println(actor.getType() + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());

    }

}
