package com.dl1_.controllerloop;

import java.util.Random;
import java.util.Scanner;
//猜数字，1-100
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int b = rand.nextInt( 1,101);
        System.out.println(b);
        System.out.println("请输入你猜的整数:");
        int a =0;
        while(true){
            a =sc.nextInt();
            if(a>b){
                System.out.println("你猜的整数大了");
            }else if(a<b){
                System.out.println("你猜的整数小了");
            }else{
                System.out.println("你猜对了");
                break;
            }
        }

    }
}
