package com.dl1_.oop.ooptest5;

public class Dog {
    private String name;
    private int age;

    public void setName(String value){
        name=value;
    }
    public String getName(){
        return name;
    }
    public void setAge(int num){
        if (num>=0&&num<=15){
            age=num;
        }else{
            System.out.println("当前的"+num+"不在合理范围内");
        }
    }
    public int getAge(){
        return age;
    }

    public void eat(){
        System.out.println(age+"岁的"+name+",正在吃骨头");
    }
}
