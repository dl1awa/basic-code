package com.dl1_.oopextends.oopextendstest3;

public class Zi extends Fu {
    String name="子";
    public void show() {
        String name="ziShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
