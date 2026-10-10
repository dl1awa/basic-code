package com.dl1_.ifdemo;

import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class ifdemoa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你充值的金额：");
        double a = scanner.nextDouble();
        if (a<=0){
            System.out.println("输入的金额有误，请重新输入");
        }else if(a<1000){
            a=a;
        }else if(a<2000){
            a=a+200;
        }else if(a<3000){
            a=a+500;
        }else if(a<5000){
            a=a+700;
        }else if(a<10000){
            a=a+1300;
        }else if(a<20000){
            a=a+2500;
        }else if(a<50000){
            a=a+6000;
        }else{
            a=a+15000;
        }
        System.out.println("你的余额为："+a);
    }
}
