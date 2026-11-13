package com.dl1_.debug.debugdemo2;

// 父类
class Fu {
    String name;
    int age;
    //父类无参构造
    public Fu() {
        System.out.println("父类无参构造执行");
    }
    //父类带参构造
    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类带参构造执行，name=" + name + ", age=" + age);
    }
}
// 子类
class Zi extends Fu {
    String name;
    public Zi() {
        System.out.println("子类无参构造执行");
    }
    // super 调父类带参构造
    public Zi(String name, int age) {
        super(name, age);          // 调用父类 Fu(String, int)
        System.out.println("子类 super 构造执行");
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println("===== 用 super 创建 =====");
        Zi z = new Zi("小明", 18);

    }
}