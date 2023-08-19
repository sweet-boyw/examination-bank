package com.src.hsp;

public class ObjectCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "小花";
        cat1.age = 3;
        cat1.hobby = "拉屎";
        cat1.color = "花色";

        Cat cat2 = new Cat();
        cat2.name = "橘子";
        cat2.age = 4;
        cat2.hobby = "打人";
        cat2.color = "橘色";

        System.out.println("第一只猫的信息：\n 猫的名字：" + cat1.name + " 猫的年龄是：" + cat1.age  + " 猫的爱好是：" + cat1.hobby + " 猫的颜色是：" + cat1.color);
        System.out.println("第二只猫的信息：\n 猫的名字：" + cat2.name + " 猫的年龄是：" + cat2.age  + " 猫的爱好是：" + cat2.hobby + " 猫的颜色是：" + cat2.color);
    }
}
class Cat{
    String name;
    int age;
    String hobby;
    String color;
}