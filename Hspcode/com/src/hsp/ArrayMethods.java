package com.src.hsp;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayMethods {
    public static void main(String[] args) {
        Integer[] integers = {1,34,23,90};
//        System.out.println(Arrays.toString(integers)); // 显示数组 [1, 34, 23, 90]
        // 排序
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));// [1, 23, 34, 90]
        // 定制排序
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(integers)); //[90, 34, 23, 1]
    }
}
