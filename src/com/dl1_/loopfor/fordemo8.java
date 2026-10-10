package com.dl1_.loopfor;

import java.util.Scanner;

public class fordemo8 {
    public static void main(String[] args) {
        //计算s（n）=1-2+3-4+。。。
        //输入n，求s（n）
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n = scanner.nextInt();
        int a = 0;
        for(int i = 1;i<=n;i++){
            if(i%2!=0){
                a=a+i;
            }else{
                a=a-i;
            }
        }
        System.out.println(a);





    }
}
