package com.dl1_.apistring.a10test;

public class Test4 {
    public static void main(String[] args) {
        String idnumber = "321104200801121234";
        String year = idnumber.substring(6,10);
        String month = idnumber.substring(10,12);
        String day = idnumber.substring(12,14);
        String sex;
        int sexnum = idnumber.substring(16,17).charAt(0)-'0';
        System.out.println(sexnum);
        if(sexnum%2==0){
            sex = "女";
        }else{
            sex = "男";
        }
        System.out.println("出生年月日："+year+"年"+month+"月"+day+"日");
        System.out.println("性别："+sex);
    }
}
