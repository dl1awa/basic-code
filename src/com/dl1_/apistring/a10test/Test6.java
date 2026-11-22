package com.dl1_.apistring.a10test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        Random random = new Random();
        String s1 = random.nextInt(10)+"";
        System.out.println(s1);
        //随机数范围[0,10)
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int index = random.nextInt(arr.length);
        String s2=arr[index]+"";
        index = random.nextInt(arr.length);
        String s3=arr[index]+"";
        index = random.nextInt(arr.length);
        String s4=arr[index]+"";
        index = random.nextInt(arr.length);
        String s5=arr[index]+"";
        StringBuilder sb = new StringBuilder(s1);
        sb.append(s2);
        sb.append(s3);
        sb.append(s4);
        sb.append(s5);
        String s =  sb.toString();

        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();

        for (int i = 0; i < c.length; i++) {
            int in = random.nextInt(c.length);
            char temp;
            temp = c[in];
            c[in] = c[i];
            c[i] = temp;
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }





    }
}
