package com.dl1_.apistring.a07stringdemo;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "1234567890abcd123";
        String s2 = "123";
        String s3 = "abc";
        String s4 = "111";
        String s5 = "";
        String s6 = "  A S D  ";
        //判断是否包含
        System.out.println(s1.contains(s2));
        System.out.println(s1.contains(s3));
        System.out.println(s1.contains(s4));
        //判断是否以指定字符串开头
        System.out.println(s1.startsWith(s2));
        //判断是否以指定字符串结尾
        System.out.println(s1.endsWith(s3));
        //判断指定字符串第一次出现的索引位置
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.indexOf(98));
        System.out.println(s1.indexOf("a"));
        //如果指定字符串不存在，返回-1
        System.out.println(s1.indexOf("AA"));
        //判断指定字符串最后一次出现的索引位置
        System.out.println(s1.lastIndexOf(s2));
        //判断是否为空
        System.out.println(s5.isEmpty());
        //转数组
        char[] c = s2.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print("-"+c[i]+"-");
        }
        System.out.println();
        //转大写
        System.out.println(s1.toUpperCase());
        //转小写
        System.out.println(s6.toLowerCase());
        //去空格
        System.out.println(s6.trim());







    }
}
