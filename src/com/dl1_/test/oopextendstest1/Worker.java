package com.dl1_.test.oopextendstest1;

public class Worker {
    // 属性
    private int id;
    private String name;
    private double salary;

    // 构造方法
    public Worker() {

    }
    public Worker(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // 方法
    public void work() {
        System.out.println("我是" + getName() + "，我正在工作");
    }
    public void eat() {
        System.out.println("我是" + getName() + "，我正在吃米饭");
    }

    //get,set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
