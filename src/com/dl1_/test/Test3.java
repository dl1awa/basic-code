package com.dl1_.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        while (true) {
            a = sc.nextDouble();
            if (a > 0) {
                System.out.println("快递的重量为：" + a);
                break;
            } else {
                System.out.println("输入错误,重新输入");
            }
        }
        double price = price1(a)+price2(a)+price3(a);
        System.out.println("快递的费用为：" + price);
    }

    public static double price1(double a) {
        double price1 = 0;
        if (a <= 1) {
            price1 = 10;
        }
        return price1;
    }
    public static double price2(double a){
        double price2 = 0;
        if (a > 1&&a<=5) {
            price2 = (a-1)*2+10;
        }
        return price2;
    }

    public static double price3(double a){
        double price3 = 0;
        if (a > 5) {
            price3 = (a-5)*1.5+18;
        }
        return price3;
    }
}
