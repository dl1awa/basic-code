package com.dl1_.apistring.a10test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        String s1 = s.trim();
        int lastindex = s1.lastIndexOf(" ");
        System.out.println(s1.length()-lastindex-1);
    }
}
