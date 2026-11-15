package com.dl1_.ooppolymorphic.test4;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog("旺财","黄色");
        a1.behavior(a1);
        Animal a2 = new Cat("哈基米","白色");
        a2.behavior(a2);
    }
}
