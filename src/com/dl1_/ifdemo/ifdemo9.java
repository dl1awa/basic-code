package com.dl1_.ifdemo;

import java.util.Scanner;

public class ifdemo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你第一个数：");
        double a = scanner.nextInt();
        System.out.println("请输入你第二个数：");
        double b = scanner.nextInt();
        System.out.println("请输入你第三个数：");
        double c = scanner.nextInt();
        if (a + b < c && a + c < b && b + c < a) {
            System.out.println("构成三角形");

            if (a == b && b == c) {
                System.out.println("构成等边三角形");
            } else if (a == b || a == c || b == c) {
                System.out.println("构成等腰三角形");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("构成直角三角形");
            } else {
                System.out.println("构成普通三角形");
            }
        }else{
            System.out.println("不能构成三角形");
        }
    }
}
