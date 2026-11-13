package com.dl1_.ooppolymorphic.test1;

public class Test {
    public static void main(String[] args) {

        Student s = new Student("张三", "zhangsan", "123456");
        StudentManger sm = new StudentManger();
        sm.register(s);

        Teacher t = new Teacher("李四", "lisi", "12345678");
        sm.register(t);
    }
}
