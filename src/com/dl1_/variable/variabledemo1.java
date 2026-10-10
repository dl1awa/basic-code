package com.dl1_.variable;

import java.net.SocketOption;

public class variabledemo1 {
    public static void main(String[] args) {
        //定义一个变量记录微信余额
        double a = 0;
        //定义一个变量记录支付宝余额
        double b = 10;
        //定义一个变量记录银行卡余额
        double c = 20;
        //输出现在一共有多少钱
        System.out.println(a + b + c);
        a=a+10-2;
        System.out.println(a);
    }
}
