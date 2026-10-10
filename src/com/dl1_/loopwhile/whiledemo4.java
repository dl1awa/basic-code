package com.dl1_.loopwhile;

public class whiledemo4 {
    public static void main(String[] args) {
        double a = 0.1;
        double high = 8848860;
        int count = 0;
        while(a<=high){
            a=a*2;
            count++;
        }
        System.out.println(count);
        //if循环
        int count1 = 0;
        for(double b = 0.1;b<=high;b=b*2){
            count1++;
        }
        System.out.println(count1);
    }
}
