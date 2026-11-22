package com.dl1_.apistring.a08stringbuilderdemo;

public class Test3 {
    public static void main(String[] args) {
        //StringBuilder的带参构造
        StringBuilder sb1 = new StringBuilder("a");

            sb1.append("bbb");
            sb1.append("ccc");
        System.out.println(sb1);
        System.out.println(sb1.reverse());
        boolean b1 = sb1 instanceof StringBuilder;
        System.out.println(b1);
        System.out.println(sb1.toString() instanceof String);












    }
}
