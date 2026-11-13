package com.dl1_.test.oopextendstest1;

public class Manager extends Worker {
    // 属性
    private double bonus;
    // 构造方法
    public Manager() {

    }
    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }
    // 方法
    @Override
    public void work() {
        System.out.println("我是" + getName() + "，我正在管理");
    }

    //get,set
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
