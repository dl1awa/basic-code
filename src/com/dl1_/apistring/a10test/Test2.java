package com.dl1_.apistring.a10test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 = sc.nextLine();
        System.out.println("请输入一个字符");

        //大小写转换
        char c1 = sc.next().charAt(0);
        char c2 = 0;
        if (c1 >= 'A' && c1 <= 'Z') {
            c2 = (char) (c1 + 32);
        } else if (c1 >= 'a' && c1 <= 'z') {
            c2 = (char) (c1 - 32);
        }else{
            c2=c1;
        }
        char[] c = s1.toCharArray();
        int count = 0;
        //统计字符出现的次数
            for (int i = 0; i < c.length; i++) {
                if (c[i] == c1 || c[i] == c2) {
                    count++;
                }
            }
        System.out.println(count);

    }
}
