package com.src.wxjtest;
/*
* 重写toString方法
* */
public class Student {
    String name;
    int age;
    public static void main(String[] args) {
        Student s1 = new Student("张三",16);
        System.out.println(s1);
        Student s2 = new Student("李四", 26);
        System.out.println(s2);
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "我叫" + name + ", 今年" + age + "岁。";
    }
}
