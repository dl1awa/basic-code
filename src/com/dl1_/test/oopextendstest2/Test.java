package com.dl1_.test.oopextendstest2;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer(1001, "张三", "讲师");
        l.work();
        Tutor t = new Tutor(1002, "李四", "助教");
        t.work();
        Maintainer m = new Maintainer(1003, "王五", "维护");
        m.work();
        Buyer b = new Buyer(1004, "赵六", "采购");
        b.work();
    }
}
