package com.dl1_.apistring.a01apidemo;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //需求，查询API文档，使用Random类中获取小数的方法
        Random r = new Random();
        double num1 =r.nextDouble();
        System.out.println(num1);
        double num2 =r.nextDouble(1,2);
        System.out.println(num2);
    }
}
