package com.dl1_.memory;

public class MemoryDemo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp;
        for(int j=0;j<arr.length/2;j++){
            temp = arr[j];
            arr[j] = arr[arr.length-1-j];
            arr[arr.length-1-j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
