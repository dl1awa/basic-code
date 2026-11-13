package com.dl1_.ooppolymorphic.test1;

public class Admin extends Person {
    public Admin(){
        super();
    }
    public Admin(String name ,String account,String password){
        super(name,account,password);
    }
    @Override
    public void work(){
        System.out.println("管理员工作是管理网站");
    }
}
