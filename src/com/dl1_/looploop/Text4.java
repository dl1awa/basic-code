package com.dl1_.looploop;

public class Text4 {
    public static void main(String[] args) {
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 6; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
