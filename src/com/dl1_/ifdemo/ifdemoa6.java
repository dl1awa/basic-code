package com.dl1_.ifdemo;

import java.util.Scanner;

public class ifdemoa6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入x的值：");
        double x = scanner.nextDouble();
        System.out.println("请输入y的值：");
        double y = scanner.nextDouble();
        if(x==0&&y==0){
            System.out.println("点(x,y)在原点");
        }else if(x>0&&y>0){
            System.out.println("点(x,y)在第一象限");
        }else if(x>0&&y<0){
            System.out.println("点(x,y)在第四象限");
        }else if(x<0&&y>0){
            System.out.println("点(x,y)在第二象限");
        }else if(x<0&&y<0){
            System.out.println("点(x,y)在第三象限");
        }else if(x==0){
            System.out.println("点(x,y)在y轴上");
        }else if(y==0){
            System.out.println("点(x,y)在x轴上");
        }
    }
}
