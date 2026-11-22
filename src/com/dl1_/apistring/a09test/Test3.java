package com.dl1_.apistring.a09test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder();
        int j = s.length() / 8;
        int a0 = s.length() % 8;
        if (s.isEmpty()) {
            System.out.println("结束");
            return;
        }

        for (int i = 0; i < j; i++) {
            System.out.println(s1.substring(i * 8, (i + 1) * 8));
        }
        if (a0 != 0) {
            s2.append(s1.substring(j * 8));
            for (int i = 0; i < 8 - a0; i++) {
                s2.append("0");

            }
            System.out.println(s2);
        }
    }
}

