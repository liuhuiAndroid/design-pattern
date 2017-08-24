package com.android.dp.builder;

/**
 * Created by lh on 2017/8/24.
 * 恶魔角色建造器：具体建造者
 */
public class DevilBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        mActor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        mActor.setSex("妖");
    }

    @Override
    public void buildFace() {
        mActor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        mActor.setCostume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        mActor.setHairstyle("光头");
    }

}
