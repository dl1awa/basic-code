package com.dl1_.memory;

public class MemoryDemo5 {
    //Java 只有值传递，只不过引用类型传的值是地址的副本
    // 所以在方法内修改了数组，方法外的地址虽然没有改变，但是指向的数组被修改了，所以外面的数组也会被修改
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("反转前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        reverse(arr);

        System.out.println("反转后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
