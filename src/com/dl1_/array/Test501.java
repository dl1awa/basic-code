package com.dl1_.array;

import java.util.Random;

public class Test501 {
    public static void main(String[] args) {
        //需求:获取10个0-100之间的随机数并存入到数组当中，要求保证数据是唯一的
        int count;
        int arr[] = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            Random rand = new Random();
            int a = rand.nextInt(101);
            for (int j = 0; j < arr.length; j++) {
                if (a == arr[j]) {
                    count++;
                }

            }
            if (count == 0) {
                arr[i] = a;
            }else {
                i--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
