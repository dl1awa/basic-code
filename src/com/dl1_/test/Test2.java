package com.dl1_.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < 10; ) {
            int a = sc.nextInt();
            if (0 <= a && a <= 100) {
                arr[i] = a;
                i++;
            } else {
                System.out.println("输入错误,重新输入");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("及格人数为：" + jigeshu(arr));
        double jigelv = ((double) jigeshu(arr) / arr.length) * 100;
        System.out.println("及格率为：" + jigelv + "%");
        System.out.println("总成绩为：" + sum(arr));
        System.out.println("平均分为：" + (sum(arr) / arr.length));
        System.out.println("最大值为：" + max(arr));
    }


    //求及格人数
    public static int jigeshu(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 60) {
                count++;
            }
        }
        return count;
    }

    //求总成绩
    public static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }


    //求最大值
    public static int max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}