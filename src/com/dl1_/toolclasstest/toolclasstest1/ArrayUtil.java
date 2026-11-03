package com.dl1_.toolclasstest.toolclasstest1;

public class ArrayUtil {
    // 打印数组
    private ArrayUtil() {
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
    }

    public static double getAverage(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double avg=(double)sum/arr.length;
        return avg;
    }
}
