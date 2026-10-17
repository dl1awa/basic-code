package com.dl1_.array;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        //需求:获取10个1-100之间的随机数并存入到数组当中，要求保证数据是唯一的
        int count;
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            Random rand = new Random();
            int a = rand.nextInt(10) + 1;
            for (int j = 0; j < arr.length; j++) {
                if (a == arr[j]) {
                    count++;
                }

            }
            if (count == 0) {
                arr[i] = a;
            } else {
                i--;
            }
            System.out.print(arr[i] + " ");//打印数组元素,但打印代码位置放置错误应该另起循环打印
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

