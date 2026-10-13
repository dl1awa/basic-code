package com.dl1_.array;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int temp;
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
