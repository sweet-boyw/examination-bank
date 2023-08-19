package com.src.wxjtest;
import java.util.Scanner;

/*
* 字符转ascll
* ascll转字符
* */
public class charToAscll {
    public static void main(String[] args) {
        // chartoascll
//        Scanner scanner = new Scanner(System.in);
//        String s = "saghd";
//        for (int i = 0;i < s.length(); i++){
//            System.out.println(s.charAt(i) + 0);
//        }
//        // ascll to char
//        System.out.println("请输入需要转为字符的ASCll值：");
//        StringBuilder sb = new StringBuilder();
//        while (scanner.hasNext()){
//            int a = scanner.nextInt();
//            System.out.println("请输入需要转换的数字，用空格隔开：");
//            String str = scanner.nextLine();
//            String[] temps = str.split(" ");
//            for (int i = 0; i< temps.length; i++){
//                sb.append(temps[i]);
//            }
//            Boolean bool = scanner.nextBoolean();
//        }
        char c = 'a';
        System.out.println( c + 0);
        int c1 = c + 1;
        System.out.println((char)c1);
    }
}
