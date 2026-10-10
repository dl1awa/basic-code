package com.dl1_.loopwhile;
import java.util.Scanner;

public class whiledemo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n = scanner.nextInt();
        if(n<0){
            n=-1*n;
        }
        int a = 0;
//      while(n%10!=0||n/10!=0){
        while(n!=0){
            a=a+n%10;
            n=n/10;
        }
        System.out.println(a);

    }
}
