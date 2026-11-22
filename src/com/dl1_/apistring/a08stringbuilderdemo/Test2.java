package com.dl1_.apistring.a08stringbuilderdemo;

public class Test2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        long end = System.currentTimeMillis();
        System.out.println(end - start+"ms");
    }
}
