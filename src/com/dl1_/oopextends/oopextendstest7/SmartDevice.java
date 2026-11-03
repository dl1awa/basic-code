package com.dl1_.oopextends.oopextendstest7;

public class SmartDevice {
    String name;
    double price;
    public void  calculatePrice() {
        if (price >= 0&&price < 1000) {
            price = price;
        }else if (price >= 1000&&price < 5000) {
            price = 0.9*price;
        }else if (price >= 5000&&price < 10000) {
            price = 0.8*price;
        }else
    }
}
