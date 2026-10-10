package com.dl1_.controllerloop;

import java.util.Scanner;

public class breakdemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的数字：");
        int n = 0 ;
        while(true){
            n = sc.nextInt();
            if(n>=2){
                break;
            }else {
                System.out.println("请输入大于等于2的数字");
            }
        }
        System.out.println("你输入的数字是：" + n);
        int count = 0;
        for(int i = 2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }

        }
        System.out.println(count);
        if (count == 0){
            System.out.println("你输入的数字是质数");
        }else{
            System.out.println("你输入的数字不是质数");
        }
    }
}
