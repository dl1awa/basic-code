package com.dl1_.loopfor;

public class fordemo5 {
    public static void main(String[] args) {
        //求1-100的偶数和
        //累加思想...................................
        int sum = 0;
        for(int a=1;a<=100;a++){
            if(a%2==0){
//                sum=sum+a;
                sum+=a;
            }
        }
        System.out.println(sum);

        int sum1=0;
        for(int b=2;b<=100;b+=2){
            sum1+=b;

        }
        System.out.println(sum1);












    }
}
