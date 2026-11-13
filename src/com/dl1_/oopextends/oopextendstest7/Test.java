package com.dl1_.oopextends.oopextendstest7;

public class Test {
    public static void main(String[] args) {
        Phone p = new Phone("Phone", 4999);
        Tablet t = new Tablet("Tablet", 6000);
        Laptop l = new Laptop("Laptop", 12000);
        p.payment();
        t.payment();
        l.payment();
        System.out.println(p.name + " " + p.payment());
        System.out.println(t.name + " " + t.payment());
        System.out.println(l.name + " " + l.payment());
    }
}
