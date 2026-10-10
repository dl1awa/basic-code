package com.dl1_.controllerloop;

import java.util.Scanner;

public class breakdemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxhp = 200;
        int hurt =0;
        //while循环令hurt>=0
        while(true){
            System.out.println("请输入损失的血量");
            hurt = scanner.nextInt();
            if(hurt>=0){
                break;
            }else {
                System.out.println("请输入大于0的损失量");
            }
        }
//        while (hurt <= 0) {
//            System.out.println("请输入大于0的损失量");
//            hurt = scanner.nextInt();
//        }
        int hp1 = maxhp - hurt;
        if (hp1<=1){
            hp1=1;
        }
        System.out.println("剩余血量" + hp1);
        int add =0;
        //while循环令add>=0
        while(true){
            System.out.println("请输入恢复的血量");
            add = scanner.nextInt();
            if(add>=0){
                break;
            }else {
                System.out.println("请输入大于0的恢复量");
            }
        }
//        while (add <= 0) {
//            System.out.println("请输入大于0的恢复量");
//            add = scanner.nextInt();
//        }
        int hp2 = hp1 + add;
        if (hp2 >= 200) {
            hp2 = 200;
        }
        System.out.println("剩余血量" + hp2);
    }
}

