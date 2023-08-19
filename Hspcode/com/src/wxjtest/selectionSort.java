package com.src.wxjtest;

import java.util.Arrays;

/*
* 选择排序
* */
public class selectionSort {
    public static void main(String[] args) {
        System.out.println("===================选择排序=====================");
        selectionSort Ssort = new selectionSort();
        int arr[] = new int[]{90,87,76,100,636,23,929,86};
        Ssort.ascending(arr);
        Ssort.descending(arr);
    }
    // 升序排序
    public static int[] ascending(int[] arr){
        int len = arr.length;
        int tmp;
        for (int i = 0; i <= len - 1; i++){
            for (int j = i + 1; j <= len - 1; j ++){
                if (arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("升序排序：" + Arrays.toString(arr));
        return arr;
    }
    // 降序排序
    public static int[] descending(int[] arr){
        int len = arr.length;
        int tmp;
        for (int i = 0; i <= len - 1; i++){
            for (int j = i + 1;j <= len - 1; j ++){
                if (arr[i] < arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("降序排序：" + Arrays.toString(arr));
        return arr;
    }
}
