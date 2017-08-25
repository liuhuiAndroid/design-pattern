package com.android.dp.adapter;

/**
 * Created by lh on 2017/8/25.
 * 操作适配器：适配器
 * 适配器可以调用另一个接口，作为一个转换器。
 */
public class OpetationAdapter implements ScoreOperation {

    private QuickSort sortObj;      //定义适配者QuickSort对象
    private BinarySearch searchObj; //定义适配者BinarySearch对象

    public OpetationAdapter() {
        this.sortObj = new QuickSort();
        this.searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);    //调用适配者类QuickSort的排序方法
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array, key); //调用适配者类BinarySearch的查找方法
    }
}
