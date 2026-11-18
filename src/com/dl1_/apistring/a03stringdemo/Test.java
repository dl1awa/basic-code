package com.dl1_.apistring.a03stringdemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //已知正确的用户名和密码，请用程序实现模拟用户登录
        //总过给三次机会，登录之后给出相应的提示
        Scanner sc = new Scanner(System.in);

        String rightUsername = "admin";
        String rightPassword = "123456";
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("用户名或密码错误");
            }
            if(i==2){
                System.out.println("连续错误三次，登录失败");
            }
        }

    }

}
