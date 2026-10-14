package com.dl1_.method;

public class MethodDemo6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(add(a,b));
    }
    public static double add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static double add(double a, int b) {
        return a + b;
    }
    public static double add(int a, double b) {
        return a + b ;
    }
}
