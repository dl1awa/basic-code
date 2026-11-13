package com.dl1_.test.oopextendstest2;

public class Employee {
    //属性
    private int id;
    private String name;
    private String work;

    //构造方法
    public Employee() {
    }
    public Employee(int id, String name, String work) {
        this.id = id;
        this.name = name;
        this.work = work;
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
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }

    public void work() {
        System.out.println("我是" + getId() + "的" + getName() + "，我在负责"+getWork()+"的工作");
    }
}
