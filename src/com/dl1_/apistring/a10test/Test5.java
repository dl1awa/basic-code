package com.dl1_.apistring.a10test;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        String str = "Jkdi234klowe90a3";
//        char[] c = str.toCharArray();
//        String[] s = new String[c.length];
//        for (int i = 0; i < c.length; i++) {
//            if(c[i]>='0' && c[i]<='9') {
//                s[i] = "*"+c[i]+"*";
//            }else {
//                s[i] = c[i]+"";
//            }
////            System.out.print(s[i]);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length; i++) {
//            sb.append(s[i]);
//        }
//        String r = sb.toString().replace("**","");
//        System.out.println(r);

        String rep = str.replace("1", "*1*");
        rep = rep.replace("2", "*2*");
        rep = rep.replace("3", "*3*");
        rep = rep.replace("4", "*4*");
        rep = rep.replace("5", "*5*");
        rep = rep.replace("6", "*6*");
        rep = rep.replace("7", "*7*");
        rep = rep.replace("8", "*8*");
        rep = rep.replace("9", "*9*");
        rep = rep.replace("0", "*0*");
        rep = rep.replace("**", "");
        System.out.println(rep);

    }
}
