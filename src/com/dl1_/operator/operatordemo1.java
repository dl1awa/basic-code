package com.dl1_.operator;

import java.util.Scanner;

public class operatordemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int a = scanner.nextInt();
        System.out.println("这个数的百位是：" + (a%1000) / 100);
        System.out.println("这个数的十位是：" + (a%100)/10);
        System.out.println("这个数的个位是：" + (a%10)/1);
    }
}
