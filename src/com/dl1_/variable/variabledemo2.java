package com.dl1_.variable;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class variabledemo2 {
    public static void main(String[] args) {
    //bmi身体质量指数计算公式：bmi=体重（kg）/身高^2（m^2）
    //定义变量记录本人体重
    double weight = 62;
    //定义变量记录本人身高
    double height = 1.78;
    //定义变量记录bmi
    double bmi = weight / (height * height);
    //打印bmi
    System.out.println(bmi);
    //计算出我当前的身高在标准bmi下最多是重
        double maxBmi=23.9;
        double maxWeight = maxBmi * (height * height);
        System.out.println(maxWeight);

        //键盘录入前置条件，必须导入Scanner类！！！！！！！！！！！！！！！！！！！！！！
        Scanner scanner = new Scanner(System.in);
//        int aaa = scanner.nextInt();
//        System.out.println(aaa);
//        double bbb = scanner.nextDouble();
//        System.out.println(bbb);
//        String ccc = scanner.next();
//        System.out.println(ccc);

//        System.out.println("请输入两个数字(第一个为整数，第二个为小数）：");
//        int num1 = scanner.nextInt();
//        double num2 = scanner.nextDouble();
//        System.out.println(num1+num2);

        System.out.println("请输入你的体重：");
        double weight1 = scanner.nextDouble();
        System.out.println("请输入你的身高：");
        double height1 = scanner.nextDouble();
        double bmi1 = weight1 / (height1 * height1);
        System.out.println("你的bmi是："+bmi1);
    }
}
