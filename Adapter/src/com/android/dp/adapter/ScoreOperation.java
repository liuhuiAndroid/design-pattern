package com.android.dp.adapter;

/**
 * Created by lh on 2017/8/25.
 * 抽象成绩操作类：目标接口
 */
public interface ScoreOperation {

    int[] sort(int array[]); // 成绩排序

    int search(int array[],int key); // 成绩查找

}
