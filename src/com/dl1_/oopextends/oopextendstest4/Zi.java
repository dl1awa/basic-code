package com.dl1_.oopextends.oopextendstest4;

public class Zi extends Fu {
    String name = "Zi";

    public void Show() {
        System.out.println(name);//this.name
        System.out.println(super.name);
        System.out.println(address);//super.address
    }
}
