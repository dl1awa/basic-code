package com.dl1_.apistring.a02stringdemo;

public class Test {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s);
        String s1 = new String();
        System.out.println("--"+s1+"!!");
        String s2 = new String("hello");
        System.out.println(s2);
        String s3 = new String(s);
        System.out.println(s3);
        char[] arr = {'a','b','c'};
        String s4 = new String(arr);
        System.out.println(s4);

        byte[] arr2 = {97,98,99,100,101};
        String s5 = new String(arr2);
        System.out.println(s5);
    }
}
