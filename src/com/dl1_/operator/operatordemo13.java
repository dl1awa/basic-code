package com.dl1_.operator;

import java.util.Scanner;

public class operatordemo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个两位整数：");
        int a = scanner.nextInt();
        int a1 = a / 10 % 10;
        int a2 = a % 10;
        int a3 = a % 7;
        boolean b = a1 == 7 || a2 == 7 || a3 == 0;
        System.out.println(b);
    }
}
