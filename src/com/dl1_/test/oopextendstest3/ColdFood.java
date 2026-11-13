package com.dl1_.test.oopextendstest3;

public class ColdFood extends Food {
    private String shelfLife;

    public ColdFood() {

    }
    public ColdFood(String name, double price, String flavor, String shelfLife,String note) {
        super(name, price, flavor,note);
        this.shelfLife = shelfLife;
    }

    public String getShelfLife() {
        return shelfLife;
    }
    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public void Description() {
        super.Description();
        System.out.println("，保质期：" + getShelfLife());
    }
}
