package com.dl1_.test.oopextendstest4;

public class Product {
    private String name;
    private int price;

    public Product() {
    }
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void showinfo() {
        System.out.println(getName());
        System.out.println(getPrice());
    }




    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
