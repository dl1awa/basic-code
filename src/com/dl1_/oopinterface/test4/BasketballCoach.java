package com.dl1_.oopinterface.test4;

public class BasketballCoach extends Person {
    public BasketballCoach() {

    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("篮球教练教打篮球");
    }

}
