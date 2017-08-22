package com.android.dp.decorator;

/**
 * Created by we-win on 2017/8/22.
 * 冷月 伤害600
 */
public class TheColdestMonthWeapon implements IWeapon{


    @Override
    public int caculateAttack() {
        return 600;
    }

    @Override
    public String description() {
        return "冷月";
    }

}
