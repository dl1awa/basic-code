package com.dl1_.debug;

public class DebugDemo1 {

    //断点调试demo

    //null不能调用方法
    // 调试：数组越界异常

    public static void main(String[] args) {
        String[] names = {"张三", null, "王五"};
        for (int i = 0; i <= names.length; i++) {
            System.out.println(names[i].length());
        }
    }
}
