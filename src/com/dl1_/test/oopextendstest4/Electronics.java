package com.dl1_.test.oopextendstest4;

public class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics( String name, int price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }
    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println(getBrand());
        System.out.println(getModel());
    }


    public void serBrand(String brand) {
        this.brand = brand;
    }
    public void serModel(String model) {
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
}
