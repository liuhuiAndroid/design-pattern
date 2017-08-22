package com.android.dp.decorator;

/**
 * Created by we-win on 2017/8/22.
 */
public class Client {

    public static void main(String[] args) {

        // 一个镶嵌2颗红玛瑙，1颗太阳石的靴子
        System.out.println("一个镶嵌2颗红玛瑙，1颗太阳石的靴子");
        IWeapon weapon = new SardonyxGem(new SardonyxGem(new SunStoneGem(new DemonBloodWeapon())));
        System.out.println("攻击力  : " + weapon.caculateAttack());
        System.out.println("描述 :" + weapon.description());
        System.out.println("-------");


        // 半透明装饰模式
        // 一个镶嵌2颗红玛瑙，1颗太阳石的靴子
        System.out.println("一个镶嵌2颗红玛瑙，1颗太阳石的靴子");
        weapon = new TheColdestMonthWeapon();
        SunStoneGem sunStoneGem;
        sunStoneGem = new SunStoneGem(weapon);
        System.out.println("攻击力  : " + sunStoneGem.caculateAttack());
        System.out.println("描述 :" + sunStoneGem.description());
        System.out.println("颜色 :" + sunStoneGem.color());
        System.out.println("-------");

    }

}
