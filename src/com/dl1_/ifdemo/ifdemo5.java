package com.dl1_.ifdemo;

import java.util.Scanner;

public class ifdemo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        double a = scanner.nextDouble();
        if (a>100||a<0){
            System.out.println("输入的成绩有误，请重新输入");
        } else if (a>=60){
            System.out.println("通过");
        }else {
            System.out.println("未通过");
        }

    }
}
