package com.src.hsp.abstract_;

public class Animal {
    public static void main(String[] args) {

    }
}
abstract class A{
    String name;
    public A(String name){
        this.name = name;
    }
    public abstract void hi(); // 抽象方法
}
abstract class B extends A{

    public B(String name) {
        super(name);
    }
}
class C extends A{
    public C(String name) {
        super(name);
    }

    @Override
    public void hi() {

    }
}