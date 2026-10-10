package com.dl1_.loopwhile;

public class whiledemo3 {
    public static void main(String[] args) {
        //for 循环
        int count=0;
        for(int mon=10000;mon<=20000;mon=(int)(1.017*mon)){
            count++;
        }
        System.out.println(count);

        //while 循环
        int count1=0;
        int mon1=10000;
        while(mon1<=20000){
            mon1=(int)(1.017*mon1);
            count1++;
        }
        System.out.println(count1);
    }
}
