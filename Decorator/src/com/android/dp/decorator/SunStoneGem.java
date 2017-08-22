package com.android.dp.decorator;

import java.awt.Color;

/**
 * Created by we-win on 2017/8/22.
 * 太阳石装饰类：具体装饰类
 * 伤害+6
 */
public class SunStoneGem implements IGem {

    /**
     * 每个宝石维护一个装备
     */
    private IWeapon mWeapon;

    public SunStoneGem(IWeapon weapon) {
        this.mWeapon = weapon;
    }

    @Override
    public int caculateAttack() {
        return 6 + mWeapon.caculateAttack();
    }

    @Override
    public String description() {
        return mWeapon.description() + " + 太阳石";
    }

    /**
     * 太阳石有一个特殊的方法：查看颜色
     * @return
     */
    public Color color(){
        return Color.RED;
    }

}
