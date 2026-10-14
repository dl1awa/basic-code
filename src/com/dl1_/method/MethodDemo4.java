package com.dl1_.method;

public class MethodDemo4 {
    public static void main(String[] args) {
        print99Table();
    }
    public static void print99Table() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");

            }
            System.out.println();
        }
    }
}
