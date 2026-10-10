package com.dl1_.ifdemo;

import java.util.Scanner;

public class ifdemoa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int a = scanner.nextInt();
        if (a<=0){
            System.out.println("输入的不是正整数");
        }else {
            if (a%2==1){
                a=3*a+1;
            }else if (a%2==0){
                a=a/2;
            }
            System.out.println("结果是："+a);
        }
    }
}
