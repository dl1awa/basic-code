package com.dl1_.test.oopextendstest3;

public class Test {
    public static void main(String[] args) {
        HotFood h= new HotFood("热菜水煮鱼", 88, "麻辣", "20分钟","适合重口味客人");
        System.out.println(h.getName()+h.getPrice()+h.getFlavor()+h.getCookingtime()+h.getNote());
        h.Description();
        ColdFood c= new ColdFood("凉菜拍黄瓜", 10, "酸辣", "30分钟","适合所有客人");
        System.out.println(c.getName()+c.getPrice()+c.getFlavor()+c.getShelfLife()+c.getNote());
        c.Description();
    }
}