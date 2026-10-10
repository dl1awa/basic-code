package com.dl1_.ifdemo;

import java.util.Scanner;

public class ifdemoa4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你使用的电量：");
        double usage = scanner.nextDouble();
        if (usage < 0) {
            System.out.println("输入的电量有误，请重新输入");
        } else if (usage <= 100) {
            System.out.println("你的电费为：" + usage * 0.5);
        } else if (usage <= 200) {
            System.out.println("你的电费为：" + (100 * 0.5 + (usage - 100) * 0.8));
        } else {
            System.out.println("你的电费为：" + (100 * 0.5 + 100 * 0.8 + (usage - 200) * 1.2));
        }
    }
}
