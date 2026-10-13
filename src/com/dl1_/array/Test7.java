package com.dl1_.array;

public class Test7 {
    //数组作业1
    public static void main(String[] args) {
        //给定数组arr和目标整数t，找出和为t的两个数，并输出索引
        int arr[] = {2, 7, 11, 15};
        int t =18;
        int slow = 0;
        while (slow < arr.length) {
            int fast = slow+1;
            while (fast < arr.length) {
                if (arr[slow] + arr[fast]==t) {
                    System.out.println(slow + ", " + fast);
                    break;
                }else {
                    fast++;
                }
            }
            slow++;
        }
    }
}
