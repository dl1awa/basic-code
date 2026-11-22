package com.dl1_.apistring.a09test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        while (true) {
            if (s.equals("拜拜")) {
                break;
            }else{
                StringBuilder s1 = new StringBuilder(s);
                StringBuilder r = s1.reverse();
                System.out.println(r);
                s = sc.next();
            }
        }
    }
}
