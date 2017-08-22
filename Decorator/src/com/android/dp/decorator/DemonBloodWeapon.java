package com.android.dp.decorator;

/**
 * Created by we-win on 2017/8/22.
 * 斩妖泣血 伤害650
 */
public class DemonBloodWeapon implements IWeapon{

    @Override
    public int caculateAttack() {
        return 650;
    }

    @Override
    public String description() {
        return "斩妖泣血";
    }

}
