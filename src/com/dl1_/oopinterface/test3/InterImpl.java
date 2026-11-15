package com.dl1_.oopinterface.test3;

public class InterImpl extends Person implements Inter1, Inter2 {

    @Override
    public void method1() {
        System.out.println("method1");
    }
    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void m1() {
        System.out.println("m1");
    }
    @Override
    public void m2() {
        System.out.println("m2");
    }
    @Override
    public void m3() {
        System.out.println("m3");
    }


    @Override
    public void show2() {
        System.out.println("show2");
    }

}
