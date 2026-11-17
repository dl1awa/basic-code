package com.dl2_.studentmanager;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[999];
        Student s = new Student();
        while (true) {
            System.out.println("请输入第"+(count+1)+"个学生的信息");
            System.out.println("请输入学号：");
            s.setId(sc.nextInt());
            if (s.getId()==999) {
                System.out.println("输入999结束循环录入");
                break;
            }else if (s.getId()==count+1) {
                sc.nextLine();
                System.out.println("请输入姓名：");
                s.setName(sc.nextLine());
                System.out.println("请输入年龄：");
                s.setAge(sc.nextInt());
                arr[count] = s.getId()+","+s.getName()+","+s.getAge();
                count++;
            }else{
                System.out.println("输入的数字不连贯或者输入错误");
            }
        }
        System.out.println("录入完成");
        System.out.println("学生信息如下：");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }

    }
}
