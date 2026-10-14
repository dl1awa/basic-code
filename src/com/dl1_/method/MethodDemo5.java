package com.dl1_.method;

public class MethodDemo5 {
    public static void main(String[] args) {
        if (getArea(10.1, 5.1) > getArea(9.1, 6.1)) {
            System.out.println("矩形1的面积大于矩形2的面积");
        } else if (getArea(10.1, 5.1) < getArea(9.1, 6.1)) {
            System.out.println("矩形2的面积大于矩形1的面积");
        } else {
            System.out.println("矩形1的面积等于矩形2的面积");
        }
    }
    public static double getArea(double a, double b) {
        double area = a * b;
        return area;
    }
}
