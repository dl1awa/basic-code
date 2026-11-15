package com.dl1_.oopinterface.test1;

import com.dl1_.oopinterface.test2.Inter;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙1", "青色");
        f.eat();
        f.swim();
        System.out.println(f);
        System.out.println(f.getName()+f.getColor());
        Rabbit r = new Rabbit("兔子1", "白色");
        r.eat();
        System.out.println(r);
        System.out.println(r.getName()+r.getColor());


        //test2
        System.out.println(Inter.A);
    }
}
