package com.dl1_.array;

public class Test9 {
    public static void main(String[] args) {
        //如果目标值不存在于数组中，打印应插入的位置
        //给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引。
//        int arr[] = {1, 3, 5, 7};
//        int t = 5;
        int arr[] = {1, 3, 5, 7};
        int t = 8;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                count++;
                System.out.println(i);
                break;
            }
        }
        if (count == 0) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > t) {
                    System.out.println(j);
                    break;
                }
                if(arr[arr.length-1] < t) {
                    System.out.println(arr.length);
                    break;
                }
            }
        }
    }
}
