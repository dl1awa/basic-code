package com.dl1_.operator;

import java.util.Scanner;

public class operatordemo2 {
    //时间转化联系
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数来代表秒数：");
        int ss = scanner.nextInt();
        int h = ss / 3600;
        int m = (ss % 3600) / 60;
        int s = ss % 60;
        System.out.println(h+" "+m+" "+s);
        //强制转换
        int a = 255;
        int b = 0;
        byte c = (byte)(a+b);
        System.out.println(c);

        //奇偶判断
//        int aaa = scanner.nextInt();
//        if (aaa%2==0) {
//            System.out.println("偶数");
//        } else {
//            System.out.println("奇数");
//        }
    }
}
