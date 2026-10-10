package com.dl1_.operator;

import java.util.Scanner;

public class operatordemo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个四位整数：");
        int a = scanner.nextInt();
        int a1 = a/1000%10;
        int a2 = a/100%10;
        int a3 = a/10%10;
        int a4 = a%10;
        boolean b1 = a1==a4;
        boolean b2 = a2==a3;
        boolean result = b1 && b2;
        System.out.println("这个数是回文数吗？" + result);


    }
}
