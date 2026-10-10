package com.dl1_.ifdemo;

import java.util.Scanner;

public class ifdemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxhp = 200;
        System.out.println("请输入损失的血量");
        int x = scanner.nextInt();
//        if (maxhp-x>=1){
//            int a1 = maxhp-x;
//            if (a1+y<=200){
//                System.out.println("剩余"+(a1+y)+"血");
//            }
//            if (a1+y>200){
//                System.out.println("剩余200血");
//            }
//        }
//        if (maxhp-x<1){
//            int a2=1;
//            if (a2+y<=200){
//                System.out.println("剩余"+(a2+y)+"血");
//            }
//            if (a2+y>200){
//                System.out.println("剩余200血");

//            }
//        }
        int hp1 = maxhp-x;
        if (hp1<=1){
            hp1=1;
        }
        System.out.println("剩余血量"+hp1);

        System.out.println("请输入恢复的血量");
        int y = scanner.nextInt();
        int hp2 = hp1 + y;
        if (hp2>=200){
            hp2=200;
        }
        System.out.println("剩余血量"+hp2);

    }
}
