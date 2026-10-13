package com.dl1_.array;

public class Test8 {
    public static void main(String[] args) {
        //合并有序数组
        int arr1[] = {1, 3, 5, 7, 9};
        int arr2[] = {2, 4, 6, 8, 10};
        int arr3[] = new int[arr1.length + arr2.length];
        int a = 0;
        int b = 0;
        int c = 0;
        while (a < arr1.length && b < arr2.length && c < arr3.length) {
            if (arr1[a] > arr2[b]) {
                arr3[c] = arr2[b];
                c++;
                b++;
            } else {
                arr3[c] = arr1[a];
                c++;
                a++;
            }
        }
        while (a < arr1.length) {
            arr3[c++] = arr1[a++];
        }
        while (b < arr2.length) {
            arr3[c++] = arr2[b++];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
