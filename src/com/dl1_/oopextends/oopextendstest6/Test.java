package com.dl1_.oopextends.oopextendstest6;

public class Test {
    public static void main(String[] args) {
        Phone1 p1 = new Phone1();
        p1.call();
        System.out.println("-----------------");

        Phone2 p2 = new Phone2();
        p2.sendMessage();
        p2.call();
        System.out.println("-----------------");

        Phone3 p3 = new Phone3();
        p3.sendMessage();
        p3.call();
        p3.playGame();
        System.out.println("-----------------");
    }
}
