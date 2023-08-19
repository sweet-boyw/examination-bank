package com.src.hsp;

public class Interger01 {
    public static void main(String[] args) {
        System.out.println("============装箱和拆箱================");
        System.out.println("------------手动装箱");
        int n1 = 1100;
        Integer Integer01 = Integer.valueOf(n1);
        System.out.println(Integer01);
        System.out.println("------------手动拆箱");
        int i = Integer01.intValue();
        System.out.println(i);
        System.out.println("------------自动装箱");
        Integer Integer02 = 200;
        System.out.println("------------自动拆箱");
        int n2 = Integer02;
        System.out.println(n2);
    }
}
