package com.dl1_.debug.debugdemo2;

// 父类
class Fu2 {
    String name;
    int age;
    //父类无参构造
    public Fu2() {
        System.out.println("父类无参构造执行");
    }
    //父类带参构造
    public Fu2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类带参构造执行，name=" + name + ", age=" + age);
    }
}
// 子类
class Zi2 extends Fu2 {
    String name;
    public Zi2() {
        System.out.println("子类无参构造执行");
    }
    // this 调本类另一个构造
    public Zi2(String name, int age) {
        this.name = name;          // 调用本类的 Th(String)
        this.age = age;
        System.out.println("子类 this 构造执行，age=" + age);
    }
}
public class Test2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("===== 用 this 创建 =====");
        Zi2 z2 = new Zi2("小红", 10);
    }
}