package com.dl1_.test.oopextendstest1;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager(1001, "张三", 5000, 1000);
        m.work();
        m.eat();
        System.out.println("我是" + m.getId() + "的" + m.getName() + "，我的工资是" + m.getSalary()+"，我的奖金是"+m.getBonus());
        Cook c = new Cook(1002, "李四", 4000);
        c.work();
        c.eat();
        System.out.println("我是" + c.getId() + "的" + c.getName() + "，我的工资是" + c.getSalary());
    }
}
