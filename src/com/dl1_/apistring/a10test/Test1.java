package com.dl1_.apistring.a10test;

public class Test1 {
    public static void main(String[] args) {
        String mobile = "13112345678";
        String email = "zw1234@163.com";

        String m1 = mobile.substring(0,3);
        String m2 = mobile.substring(7,11);
        String mobileresult = m1+"****"+m2;
        System.out.println(mobileresult);

        String e1 = email.substring(0,1);
        int index = email.indexOf("@");
        String e2 = email.substring(index);
        String emailresult = e1+"***"+e2;
        System.out.println(emailresult);


    }
}
