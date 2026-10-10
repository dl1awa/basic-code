package com.dl1_.ifdemo;

import java.util.Scanner;

public class ifdemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的商品价格；");
        double price = sc.nextDouble();
        if (price<=0){
            System.out.println("输入的价格有误，请重新输入");
        }else {
        double h =0.8*price;
        double s =price;
        if (s<10){
            s=s;
        }else if(s<50) {
            s = s - 8;
        }else if (s<100){
                s=s-30;
        }else  if(s<200){
            s=s-50;
        }else {
            s=s-90;
        }
            System.out.println("使用会员卡支付的金额为"+h);
            System.out.println("使用满减支付的金额为"+s);
        }
        }
    }

