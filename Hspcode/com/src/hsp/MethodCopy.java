package com.src.hsp;

public class MethodCopy {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "milan";
        p.age = 12;
        MyTools tools = new MyTools();
        Person p2 = tools.copyPerson(p);
        System.out.println("p的属性 name " + p.name + " age " + p.age);
        System.out.println("p2的属性 name " + p2.name + " age " + p2.age);
    }
}
class MyTools{
    public Person copyPerson(Person p){
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}