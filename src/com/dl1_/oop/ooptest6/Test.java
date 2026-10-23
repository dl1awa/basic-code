package com.dl1_.oop.ooptest6;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setHeight(183);
        s1.setWeight(60);
        //大一
        System.out.println(s1.getName() + "," + s1.getAge() + "," + s1.getHeight() + "," + s1.getWeight());
        s1.study();

        //大二
        s1.setAge(s1.getAge() + 1);
        int newweight = s1.getWeight() + 10;
        s1.setWeight(newweight);
        System.out.println(s1.getName() + "," + s1.getAge() + "," + s1.getHeight() + "," + s1.getWeight());

        //大三
        s1.setAge(s1.getAge() + 1);
        int newweight2 = s1.getWeight() - 3;
        s1.setWeight(newweight2);
        int newheight2 = s1.getHeight() + 2;
        s1.setHeight(newheight2);
        System.out.println(s1.getName() + "," + s1.getAge() + "," + s1.getHeight() + "," + s1.getWeight());

        //大四
        s1.setAge(s1.getAge() + 1);

        //大四毕业
        s1.setAge(s1.getAge() + 1);
        System.out.println(s1.getName() + "," + s1.getAge() + "," + s1.getHeight() + "," + s1.getWeight());
    }
}
