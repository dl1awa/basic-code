package com.dl1_.ooppolymorphic.test1;

public class Teacher extends Person {
    public Teacher(){
        super();
    }
    public Teacher(String name ,String account,String password){
        super(name,account,password);
    }
    @Override
    public void work(){
        System.out.println("教师工作是教学");
    }
}
