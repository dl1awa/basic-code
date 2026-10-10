package com.dl1_.loopfor;

import java.util.Scanner;

public class fordemo7 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = scanner.nextInt();
        for(int i = 3;i<=num;i++){
            if(i%2!=0){
                a=a+b;
            }else{
                b=b+a;
            }
        }
        if(num%2!=0){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

//            int c = 0;
//            for(int i1=3;i1<=num;i1++){
//                c=a+b;
//                a=b;
//                b=c;
//            }
//            System.out.println(c);

    }
}
