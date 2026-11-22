package com.dl1_.apistring.a09test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        String s = "abcd";
        char[] arr = s.toCharArray();
        Random r = new Random();
        char temp;
        for (int i = 0; i < arr.length; i++) {
            int index=r.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        String s1 = new String(arr);
        System.out.println(s1);
    }
}
