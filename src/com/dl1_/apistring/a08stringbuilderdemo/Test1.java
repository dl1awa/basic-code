package com.dl1_.apistring.a08stringbuilderdemo;

public class Test1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //测试字符串拼接效率
        String s1 = "";
        for (int i = 0; i < 100000; i++) {
            s1 = s1 + i;
        }
        System.out.println(s1);
        long end = System.currentTimeMillis();
        System.out.println(end - start+"ms");



    }
}
