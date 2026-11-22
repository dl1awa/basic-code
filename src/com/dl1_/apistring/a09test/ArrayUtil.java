package com.dl1_.apistring.a09test;

public class ArrayUtil {

    //将数组转换为字符串
    //1.定义一个方法，方法名arrayToString，参数为int数组，返回值为String
    //2.在方法中，遍历数组，将数组元素转换为字符串，拼接起来
    //3.返回拼接好的字符串

    private ArrayUtil() {
    }
    public static String arrayToString1 (int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                s = s + arr[i] + ",";
            } else if (i == arr.length - 1) {
                s = s + arr[i] + "]";
            }
        }
        return s;
    }

    public static String arrayToString2 (int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                sb.append(arr[i] + ",");
            } else if (i == arr.length - 1) {
                sb.append(arr[i] + "]");
            }
        }
        return sb.toString();
    }
}

