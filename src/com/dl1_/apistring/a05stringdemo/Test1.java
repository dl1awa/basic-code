package com.dl1_.apistring.a05stringdemo;

public class Test1 {
    public static void main(String[] args) {
//        String str = "abcdefghijklmn";
//        System.out.println(str.substring(0,5));
//        System.out.println(str.substring(1));
        //只放出用户名的第一个字，后面全部替换成*
        String username = "asdfghjkl";

        username = "dl1_";
        String s = username.substring(0,1);
//        String s = username.charAt(0)+"";
        for(int i=1;i<username.length();i++){
            s=s+"*";
        }
        System.out.println(s);






    }
}
