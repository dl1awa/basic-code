package com.dl1_.test.oopextendstest3;

public class Food {
    private String name;
    private double price;
    private String flavor;
    private String note;


    public Food() {
    }
    public Food(String name, double price, String flavor,String note) {
        this.name = name;
        this.price = price;
        this.flavor = flavor;
        this.note=note;
    }



    public void Description() {
        System.out.print("名称：" + getName() + "，价格：" + getPrice() + "，口味：" + getFlavor()+"，备注："+getNote());
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getFlavor() {
            return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
