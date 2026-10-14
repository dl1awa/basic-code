package com.dl1_.method;

import java.util.Random;

public class MethodDemo2 {

    //定义判断这个数是否存在数组的方法
    public static boolean contains(int num, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //需求:获取10个1-100之间的随机数并存入到数组当中，要求保证数据是唯一的
        int count;
        int arr[] = new int[10];
        for (int i = 0; i < arr.length;) {
            Random rand = new Random();
            int a = rand.nextInt(10) + 1;
            //调用方法判断这个数是否存在数组中
            boolean flag = contains(a, arr);
            if (!flag) {
                arr[i] = a;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}