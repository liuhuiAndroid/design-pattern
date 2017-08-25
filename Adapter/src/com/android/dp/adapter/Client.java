package com.android.dp.adapter;

/**
 * Created by lh on 2017/8/25.
 * 客户端测试代码
 */
public class Client {

    public static void main(String args[]) {
        //针对抽象目标接口编程
        ScoreOperation operation = new OpetationAdapter();

        int sores[] = {84, 76, 50, 69, 90, 91, 88, 96};
        int result[];
        int score;

        System.out.print("成绩排序结果：");
        result = operation.sort(sores);

        for (int i : result) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        score = operation.search(result, 90);
        if (score != -1) {
            System.out.println("找到成绩90");
        }else{
            System.out.println("没有找到成绩90");
        }

    }
}
