package com.src.hsp;

public class MethodPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "wangxingjiang";
        person.age = 19;
        System.out.println("我的名字叫" + person.name + ",我今年" + person.age + "岁，");
        person.speak();
        boolean re = getBool(7);
    }
    public static Boolean getBool(int n){
        return true;
    }

    public int getAge() {
        return 1;
    }
}
class Person{
    String name;
    int age;
    public void speak(){
        System.out.println("我是一个好人");
    }
}
