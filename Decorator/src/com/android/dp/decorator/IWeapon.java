package com.android.dp.decorator;

/**
 * Created by we-win on 2017/8/22.
 * 武器的接口
 */
public interface IWeapon {

    /**
     * 计算伤害
     * @return
     */
    int caculateAttack();

    /**
     * 武器描述
     * @return
     */
    String description();

}
