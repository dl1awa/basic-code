package com.dl1_.ifdemo;

import java.util.Scanner;

public class ifdemoa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的体重：");
        double weight = scanner.nextDouble();
        System.out.println("请输入你的身高:");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("你的BMI指数是：" + bmi);
        if (bmi < 18.5) {
            System.out.println("消瘦");
        } else if (bmi < 23.9) {
            System.out.println("正常");
        } else if (bmi < 26.9) {
            System.out.println("偏胖");
        } else if (bmi < 29.9){
            System.out.println("肥胖");
        } else {
            System.out.println("严重肥胖");
        }
    }
}
