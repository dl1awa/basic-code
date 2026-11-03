package com.dl1_.oopextends.oopextendstest2;

public class Phone extends SmartDevice {

    public void call() {
        System.out.println(price + "元的" + brand + "手机在打电话");
    }
    public void sendMessage() {
        System.out.println(price + "元的" + brand + "手机在发送短信");
    }

}
