package com.dl1_.oopextends.oopextendstest8;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
        Fu f = new Fu();
        f.method();
        //final修饰类是最终类，不能被继承
        //final修饰方法是最终方法，不能被重写
    }
}
