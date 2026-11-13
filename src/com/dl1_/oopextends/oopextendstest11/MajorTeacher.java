package com.dl1_.oopextends.oopextendstest11;
// 专业课教师
public class MajorTeacher extends Teacher {
    private String subject;
//构造方法
    public MajorTeacher() {
        super();
    }
    public MajorTeacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void teach() {
        System.out.println(getAge() + "岁的" + getName() + "正在教专业课知识：" + subject);
    }
//set,get
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
