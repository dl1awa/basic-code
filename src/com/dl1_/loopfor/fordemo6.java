package com.dl1_.loopfor;

import java.util.Scanner;

public class fordemo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max =a>b?a:b;
        int min =a<b?a:b;
//统计思想..................................................
        int count=0;
        for(int i = min;i<=max;i++){
            if (i%3==0&&i%5==0){
                count++;
                System.out.println(i);
            }
        }
        if (count==0){
            System.out.println("没有能被3和5整除的数字");
        }else {
            System.out.println("能被3和5整除的有"+count+"个数字");
        }








    }
}
