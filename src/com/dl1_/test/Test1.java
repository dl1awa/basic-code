package com.dl1_.test;

import java.util.Scanner;

//评委打分，求平均分，排除最高分最低分
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; ) {
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
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = (sum - max(arr) - min(arr)) / (arr.length - 2);
        System.out.println("平均分为：" + avg);


    }

    public static int max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
