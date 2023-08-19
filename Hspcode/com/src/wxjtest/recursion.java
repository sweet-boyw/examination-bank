package com.src.wxjtest;
/*
* 递归
* */
public class recursion {
    public static void main(String[] args) {
        System.out.println("================递归===================");
        F f = new F();
        int rf = f.factorial(4);
        System.out.println(rf);
        int rc = f.cumulation(4);
        System.out.println(rc);
        f.rePrint(7);
    }
}
class F{
    // 阶乘
    public int factorial(int n){
        if (n == 1){
            return 1;
        }else {
            return  factorial(n - 1) * n;
        }
    }
    // 累加
    public int cumulation(int n){
        if (n == 1){
            return 1;
        }else {
            return cumulation(n - 1) + n;
        }
    }
    // 打印数据n遍
    public void rePrint(int n){
        if (n == 1){
            System.out.println("打印" + n);
            return;
        }else {
            rePrint(n - 1);
            System.out.println("打印" + n);
        }
    }
}