package com.dl1_.memory;

public class MemoryDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //交换前
        System.out.println(a + " " + b);
        change(a, b);
        System.out.println(a + " " + b);
    }

    public static void change(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
}
