package com.dl1_.ooppolymorphic.test1;

public class StudentManger {

    //定义一个注册方法
    public void register(Person person){
        System.out.println(person.getName()+"的账户注册成功"+"账号："+person.getAccount()+"密码："+person.getPassword());
        person.work();
    }
}
