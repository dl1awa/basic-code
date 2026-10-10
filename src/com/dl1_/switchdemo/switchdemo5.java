package com.dl1_.switchdemo;

public class switchdemo5 {
    public static void main(String[] args) {
//        int a = 1;
//        String b =switch (a) {
//            case 1,111-> "11";
//            case 2,222->{
//                yield "22";
//            }
//            case 3,333-> {
//                yield "33";
//            }
//            default-> {
//                yield "输入错误";
//            }
//        };
//        System.out.println(b);

        int a = 10;
        int b = 20;
        String c = "*";
        int result = switch (c){
            case "*"->{
                int d=a*b;
                yield d;
            }
            case "+"-> a+b;
            case "-"-> {
                yield a-b;
            }
            default -> {
                yield 0;
            }
        };
        System.out.println(result);
    }
}
