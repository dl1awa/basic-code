package com.dl1_.ooppolymorphic.test1;


public class Student extends Person {
    public Student(){
    }
    public Student(String name ,String account,String password){
        super(name,account,password);
    }
    @Override
    public void work(){
        System.out.println(getName()+"学生工作是学习");
    }
}
