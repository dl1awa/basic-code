package com.dl1_.memory;

public class MemoryDemo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("arr 的地址 = " + arr);
        reassign(arr);
        System.out.println("外面看到的 arr[0] = " + arr[0]);   // 预测：？1
        System.out.println("arr 的地址 = " + arr);   // 打印数组对象，会输出类似 [I@1b6d3586
        // 原因：方法内改了数组的指向，只是改了方法内的数组，外面的数组无影响
    }

    public static void reassign(int[] a) {
        System.out.println("【方法内】改指向之前 a[0] = " + a[0]);
        System.out.println("a 的地址（改之前）= " + a);
        a = new int[]{100, 200, 300};
        System.out.println("【方法内】改指向之后 a[0] = " + a[0]);
        System.out.println("a 的地址（改之后）= " + a);
    }
}