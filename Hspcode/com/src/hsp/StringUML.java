package com.src.hsp;

public class StringUML {
    public static void main(String[] args) {
        System.out.println("===================String常用方法======================");
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2)); // 区分大小写 false
        System.out.println(str1.equalsIgnoreCase(str2)); // 不区分大小写 true
        System.out.println(str1.length()); // 获取字符串的长度 5
        System.out.println(str1.indexOf('e')); // 返回字符'e'在字符串中的位置 1
        System.out.println(str1.lastIndexOf('e'));  // 返回字符在字符串中最后一次出现的位置 1
        System.out.println(str1.substring(4)); // 从索引4开始截取字符串的字符到最后 o
        System.out.println(str2.substring(0,2)); // 从0开始截取到2 He
        System.out.println(str1.charAt(0)); // 获取位置0的字符 h
        System.out.println(str1.toUpperCase()); // HELLO
        System.out.println(str1.toLowerCase()); // hello
        System.out.println(str1.concat(" world")); // hello world
        System.out.println(str1.replace("e","E")); // hEllo 对str1没有影响
        System.out.println(str1.split("")); // ["h","e","l","l","o"]
        System.out.println(str1.toCharArray()); // ['h','e','l','l','o']
        String name = "王兴江";
        int age = 18;
        char gender = '男';
        double score = 98.5;
        String str3 = String.format("我叫%s,今年%d岁,%c,我的成绩是%.2f",name,age,gender,score);
        System.out.println(str3);
    }
}
