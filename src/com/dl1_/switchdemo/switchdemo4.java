package com.dl1_.switchdemo;

import java.util.Scanner;

public class switchdemo4 {
    public static void main(String[] args) {
        int a = 1;
//        switch (a) {
//            //去掉break，实现多个case共用一段代码，case穿透
//            case 1:
//                System.out.println("11");
//            case 2:
//                System.out.println("22");
//            case 3:
//                System.out.println("33");
//            default:
//                System.out.println("输入错误");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
                default:
                System.out.println("输入错误");
        }

    }
}
