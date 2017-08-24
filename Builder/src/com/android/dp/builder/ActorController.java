package com.android.dp.builder;

/**
 * Created by lh on 2017/8/24.
 * 游戏角色创建控制器：指挥者
 */
public class ActorController {

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
