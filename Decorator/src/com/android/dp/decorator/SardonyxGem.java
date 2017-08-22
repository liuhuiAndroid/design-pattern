package com.android.dp.decorator;

/**
 * Created by we-win on 2017/8/22.
 * 红玛瑙装饰类：具体装饰类
 * 伤害+8
 */
public class SardonyxGem implements IGem {

    /**
     * 每个宝石维护一个装备
     */
    private IWeapon mWeapon;

    public SardonyxGem(IWeapon weapon) {
        this.mWeapon = weapon;
    }

    @Override
    public int caculateAttack() {
        return 8 + mWeapon.caculateAttack();
    }

    @Override
    public String description() {
        return mWeapon.description() + " + 红玛瑙";
    }

}
