package com.dl1_.toolclasstest.toolclasstest1;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10,20,50,34,100};
        ArrayUtil.printArray(arr);
        double avg = ArrayUtil.getAverage(arr);
        System.out.println("数组的平均值为："+avg);



        int[] arr2 = {1,2,3,4,5};
        ArrayUtil.printArray(arr2);
        double avg2 = ArrayUtil.getAverage(arr2);
        System.out.println("数组的平均值为："+avg2);
    }
}
