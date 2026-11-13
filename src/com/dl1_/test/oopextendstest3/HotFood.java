package com.dl1_.test.oopextendstest3;

public class HotFood extends Food {
    private String cookingtime;

    public HotFood() {

    }
    public HotFood(String name, double price, String flavor, String cookingtime,String note) {
        super(name, price, flavor,note);
        this.cookingtime = cookingtime;
    }

    @Override
    public void Description() {
        super.Description();
        System.out.println("，烹饪时间：" + getCookingtime());
    }



    public String getCookingtime() {
        return cookingtime;
    }
    public void setCookingtime(String cookingtime) {
        this.cookingtime = cookingtime;
    }
}
