package com.dl1_.apistring.a09test;

public class Test5 {
    public static void main(String[] args) {
        String num1 = "12395";
        String num2 = "133";
        int maxlength;//5
        int minlength;
        if (num1.length() >= num2.length()) {
            maxlength = num1.length();
            minlength = num2.length();
            char[] arr1 = num1.toCharArray();// 1,2,3,9,5
            for (int i = 0; i < maxlength - minlength; i++) {
                num2 = "0" + num2;
            }
            char[] arr2 = num2.toCharArray();//0,0,1,3,3
            int[] r = new int[maxlength + 1];//0,0,0,0,0,0
            int[] a1=ci(arr1);//1,2,3,9,5
            int[] a2=ci(arr2);//0,0,1,3,3
            int count = 0;
            for (int i = maxlength; i >0; i--) {
                if(count==0) {
                    r[i] = a1[i-1] + a2[i-1];
                }else{
                    r[i] = a1[i-1] + a2[i-1]+1;
                }
                count=0;
                if (r[i] >= 10) {
                    r[i] = r[i]-10;
                    count++;
                }
            }
           r[0]=count;

            //r  0,1,2,5,2,8
            //r1 1,2,5,2,8

            int[] r1;
            if (r[0]==0) {
                r1 = new int[maxlength];
                for (int i = 0; i < r1.length; i++) {
                    r1[i] = r[i+1];
                }
            }else{
                r1 = new int[maxlength+1];
                r1=r;
            }
            char[] res=ic(r1);
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i]);
            }
        } else {
            maxlength = num2.length();
        }
    }


    public static int[] ci(char[] arr) {
        int[] r = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            r[i] = arr[i]-48;
        }
        return r;
    }
    public static char[] ic(int[] arr) {
        char[] r = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            r[i] = (char) (arr[i]+48);
        }
        return r;
    }

}
