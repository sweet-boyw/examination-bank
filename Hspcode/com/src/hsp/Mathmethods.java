package com.src.hsp;

public class Mathmethods {
    public static void main(String[] args) {
        // 绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);// 9
        // 求幂
        double pow = Math.pow(2,4);
        System.out.println(pow); // 16
        // 向上取整
        double ceil = Math.ceil(-3.001);
        System.out.println(ceil); // -3.0
        // 向下取整
        double floor = Math.floor(-3.001);
        System.out.println(floor);// -4.0
        // 四舍五入
        double round = Math.round(4.5);
        System.out.println(round);// 5
        // 开方
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt); // 3.0
        // random 获取0-1之间的随机数
        // a + Math.random() * b a-b之间的随机数
        double random = Math.random();
        System.out.println(random); //0.26997814117515906
    }
}
