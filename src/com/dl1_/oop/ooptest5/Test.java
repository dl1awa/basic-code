package com.dl1_.oop.ooptest5;

public class Test {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.setName("小白");
        d1.setAge(2);
        System.out.println(d1.getName()+','+d1.getAge()+"岁");
        d1.eat();
    }
}
