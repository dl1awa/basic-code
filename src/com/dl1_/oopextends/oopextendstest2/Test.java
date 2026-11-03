package com.dl1_.oopextends.oopextendstest2;

public class Test {
    public static void main(String[] args) {
        AndroidPhone a = new AndroidPhone();
        a.brand = "IQOO";
        a.price = 3000;
        System.out.println(a.brand + "手机的价格是" + a.price);
        a.call();
        a.sendMessage();
        a.NFC();
        System.out.println("-----------------");

        IPhone i = new IPhone();
        i.brand = "IPHONE";
        i.price = 6000;
        System.out.println(i.brand + "手机的价格是" + i.price);
        i.call();
        i.sendMessage();
        System.out.println("-----------------");

        Laptop l = new Laptop();
        l.brand = "拯救者";
        l.price = 8000;
        System.out.println(l.brand + "笔记本的价格是" + l.price);
        l.code();
    }
}
