package com.android.dp.builder;

/**
 * Created by lh on 2017/8/24.
 * 天使角色建造器：具体建造者
 */
public class AngelBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        mActor.setType("天使");
    }

    @Override
    public void buildSex() {
        mActor.setSex("女");
    }

    @Override
    public void buildFace() {
        mActor.setFace("漂亮");
    }

    @Override
    public void buildCostume() {
        mActor.setCostume("白裙");
    }

    @Override
    public void buildHairstyle() {
        mActor.setHairstyle("披肩长发");
    }

}
