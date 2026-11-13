package com.dl1_.test.oopextendstest4;

public class Clothes extends Product {
    private String size;
    private String color;

    public Clothes( String name, int price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }
    public Clothes() {

    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println(getSize());
        System.out.println(getColor());
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


}
