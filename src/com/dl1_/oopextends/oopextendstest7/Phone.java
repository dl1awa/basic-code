package com.dl1_.oopextends.oopextendstest7;

public class Phone extends SmartDevice {
    public Phone() {
    }
    public Phone(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //错误的写法
    //下面super.price调用的是父类的属性price，而不是payment方法里的返回值
//    @Override
//    public double payment() {
//        return 0.9*super.price;
//    }
    @Override
    public double payment() {
        double payment=super.payment();
        payment = payment * 0.9;
        return payment;
    }
}
