package com.src.wxjtest;
import java.util.Scanner;
public class subStringtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = scanner.nextLine();
        System.out.println(str.length());
        System.out.println(str.substring(0,2));
        StringBuilder sb = new StringBuilder();  // 创建字符串缓冲区 操作字符串而不产生新的对象 需要使用的时候toString一下
        sb.append(str);
        sb.append('0');
        String str1 = sb.toString();
        System.out.println(str1);
    }
}
