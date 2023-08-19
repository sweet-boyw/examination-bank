package com.src.wxjtest;

public class MethodTest {
    public static void main(String[] args) {
        System.out.println("========================wxj=====================");
//        boolean result = isPrimeNumber(7);
//        System.out.println(result);
        String str = "fjsdhfgsdg";
        System.out.println(str.substring(1,2).contains("j"));
    }
    public static Boolean isPrimeNumber(int num){
        for (int i = 2; i < num; i ++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
