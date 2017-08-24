package com.android.dp.builder;

/**
 * Created by lh on 2017/8/24.
 * 角色建造者：抽象建造者
 */
public abstract class ActorBuilder {

    protected Actor mActor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    //工厂方法，返回一个完整的游戏角色对象
    public Actor creatrActor(){
        return mActor;
    }

}
