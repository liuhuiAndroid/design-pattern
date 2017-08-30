package com.android.dp.observer;

/**
 * Created by lh on 2017/8/30.
 */
public class Client {

    public static void main(String args[]) {

        AllyControlCenter acc = new ConcreteAllyControlCenter("富甲天下");

        //定义4个观察者对象
        Observer player1, player2, player3, player4;
        player1 = new Player("小冷");
        acc.join(player1);
        player2 = new Player("白魔夜");
        acc.join(player2);
        player3 = new Player("小白");
        acc.join(player3);
        player4 = new Player("坏");
        acc.join(player4);

        // 某成员遭受攻击
        player2.beAttacked(acc);

    }

}
