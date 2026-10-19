package com.dl1_.test;

//算法训练-01-删除数组数据
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 3};
        int val = 3;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                count++;

            }
        }
        int[] nums = new int[count];
        for (int i = 0; i < nums.length; ) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != val) {
                    nums[i] = arr[j];
                    i++;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
