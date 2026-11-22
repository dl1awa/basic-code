package com.dl1_.apistring.a04stringdemo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        String s = "你好你好123";
        System.out.println(s);
        char c = s.charAt(4);
        System.out.println(c);
        System.out.println(s.length());

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1 = sc.next();
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i)+" ");
        }
    }
}
