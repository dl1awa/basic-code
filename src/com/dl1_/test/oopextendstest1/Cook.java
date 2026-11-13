package com.dl1_.test.oopextendstest1;

public class Cook extends Worker {
    //构造方法
    public Cook() {
    }
    public Cook(int id, String name, double salary) {
        super(id, name, salary);
    }
    // 方法
    @Override
    public void work() {
        System.out.println("我是" + getName() + "，我正在炒菜");
    }
}
