package com.android.dp.builder;

/**
 * Created by lh on 2017/8/24.
 * 角色建造者：抽象建造者
 */
public abstract class ActorBuilder2 {

    protected Actor mActor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab){
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildCostume();
        ab.buildHairstyle();
        actor = ab.creatrActor();
        return actor;
    }

}
