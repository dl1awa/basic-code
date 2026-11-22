package com.dl1_.apistring.a06stringdemo;

public class Test1 {
    public static void main(String[] args) {
        String s = "tmd,cnm,lj";
        System.out.println(s.replace("cnm","***"));

        //定义一个敏感词库
        String[] arr={"cnm","tmd","lj"};
        for(int i=0;i<arr.length;i++) {
            s=s.replace(arr[i], "***");
        }
        System.out.println(s);





    }
}
