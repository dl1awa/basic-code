package com.dl1_.switchdemo;

import java.util.Scanner;

public class switchdemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大写数字（如一，二，三）：");
        String num = sc.next();
        switch (num){
            case "一":
                System.out.println(1);
                break;
            case "二":
                System.out.println(2);
                break;
            case "三":
                System.out.println(3);
                break;
            case "四":
                System.out.println(4);
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
