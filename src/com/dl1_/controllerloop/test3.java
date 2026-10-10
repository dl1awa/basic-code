package com.dl1_.controllerloop;

import java.util.Random;
import java.util.Scanner;

//猜数字，1-100
//小保底：每猜3次，随机数范围为当前随机数-5到当前随机数+5
//大保底：每猜10次，随机数范围为当前猜数
public class test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int b = rand.nextInt( 1,101);
        System.out.println(b);
        System.out.println("请输入你猜的整数:");
        int a =0;
        int counta=0;//小保底计数器
        int countb=0;//大保底计数器
        while(true){
            a =sc.nextInt();
            countb++;
            if(countb==10){
                System.out.println("触发大保底");
                b=a;
            }
            if(a>b){
                System.out.println("你猜的整数大了");
            }else if(a<b){
                System.out.println("你猜的整数小了");
            }else{
                System.out.println("你猜对了");
                break;
            }
            counta++;
            if(counta%3==0){
                System.out.println("触发小保底");
                System.out.println("随机数范围为"+(b-5)+"-"+(b+5));
            }
        }

    }
}
