package com.android.dp.builder;

/**
 * Created by lh on 2017/8/24.
 * 英雄角色建造器：具体建造者
 */
public class HeroBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        mActor.setType("英雄");
    }

    @Override
    public void buildSex() {
        mActor.setSex("男");
    }

    @Override
    public void buildFace() {
        mActor.setFace("英俊");
    }

    @Override
    public void buildCostume() {
        mActor.setCostume("盔甲");
    }

    @Override
    public void buildHairstyle() {
        mActor.setHairstyle("飘逸");
    }

}
