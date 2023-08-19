package com.src.wxjtest;

import java.util.Arrays;


public class bubbleSort {
    public static void main(String[] args) throws Exception {
        System.out.println("==============冒泡排序算法====================");
        bubbleSort Rsort = new bubbleSort();
        int[] arr = new int[]{4,2,8,1,9};
        System.out.println("未排序之前" + Arrays.toString(arr));
        Rsort.sort(arr,"reverse");
        Rsort.sort(arr);
    }
    public static int[] sort(int[] arr ){
        int len = arr.length; // 定义数组长度
        int tmp; // 定义交换变量
        for (int i = 0; i < len - 1; i ++){
            for (int j = 0; j < len - 1 - i; j ++){
                if (arr[j] > arr[j + 1]){
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("升序排序" + Arrays.toString(arr));
        return arr;
    }
    public static int[] sort(int[] arr, String type) throws Exception { // 逆序排序
        if ("reverse" != type){
            throw new Exception("请选择正确的排序方式，默认升序排序");
        }
        int len = arr.length; // 待排序数组长度
        int tmp; // 交换中间值
        for(int i = 0; i< len - 1; i++){
            for (int j = 0; j < len - i - 1;j++){
                // 两两相互比较，越小的越往后
                if (arr[j] < arr[j + 1]){
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("降序排序"+ Arrays.toString(arr));
        return arr;
    }
}
