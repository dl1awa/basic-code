package com.dl1_.array;

import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {
        //需求:已知数组元素为{33,5,22,44,55,33}
        //输出要求:
        //键盘录入任意一个数据，查找这个数据在数组中是否存在
        //如果数组中要查找的数据出现多次，只要显示第一次的索引即可
        //如果存在打印索引
        //如果不存在，提示:“该数据不存在”
//        int arr[]={33,5,22,44,55,33};
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if(n==arr[i]){
//                System.out.println(i);
//                break;
//            }
//            if(i==arr.length-1){
//                System.out.println("该数据不存在");
//            }
//        }
        int arr[] = {33, 5, 22, 44, 55, 33};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.println(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("该数据不存在");
        }
    }
}
