package com.dl1_.operator;

import java.util.Scanner;

public class operatordemo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        boolean result =a>=1&a<=10;
        System.out.println(result);


        int b = scanner.nextInt();
        boolean result2 = b<1|b>10;
        System.out.println(result2);
    }
}
