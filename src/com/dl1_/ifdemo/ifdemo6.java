package com.dl1_.ifdemo;

import java.util.Scanner;

public class ifdemo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入外卖的价格：");
        double a = scanner.nextDouble();
        if (a<0){
            System.out.println("输入的价格有误，请重新输入");
        }
        double e = 0.9*a;
        double mt=a;
        if (a>=30){
            mt = a-10;
        }
        System.out.println("使用饿了么的价格为："+e);
        System.out.println("使用美团的价格为："+mt);
        if (e<mt){
            System.out.println("使用饿了么更便宜");
        }else if (e>mt){
            System.out.println("使用美团更便宜");
        }else {
            System.out.println("两种外卖平台价格相同");
        }
    }
}
