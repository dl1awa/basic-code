package com.dl1_.apistring.a04stringdemo;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符)

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                count3++;
            }else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                count1++;
            }else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                count2++;
            }
        }
        System.out.println("大写字母字符出现的次数为："+count1);
        System.out.println("小写字母字符出现的次数为："+count2);
        System.out.println("数字字符出现的次数为："+count3);
    }
}
