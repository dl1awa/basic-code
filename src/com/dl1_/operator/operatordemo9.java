package com.dl1_.operator;

import java.util.Scanner;

public class operatordemo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a%3;
        boolean c = b==0;
        System.out.println(c);
    }
}
