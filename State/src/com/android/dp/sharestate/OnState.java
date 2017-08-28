package com.android.dp.sharestate;

/**
 * Created by lh on 2017/8/28.
 * 打开状态
 */
public class OnState extends State{

    @Override
    public void on(Switch s) {
        System.out.println("已经打开！");
    }

    @Override
    public void off(Switch s) {
        System.out.println("关闭！");
        s.setState(Switch.getState("off"));
    }
}
