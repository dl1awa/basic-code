package com.dl1_.oopextends.oopextendstest11;

public class Test {
    public static void main(String[] args) {
        BachelorStudent b1 = new BachelorStudent("本科生", 18, "大一");
        System.out.println(b1.getAge() + "岁的" + b1.getGrade() + b1.getName());
        b1.eat();
        b1.sleep();
        b1.study();
        MasterStudent ms1 = new MasterStudent("研究生", 22, "研一");
        System.out.println(ms1.getAge() + "岁的" + ms1.getGrade() + ms1.getName());
        ms1.eat();
        ms1.sleep();
        ms1.study();
        MajorTeacher mt1 = new MajorTeacher("专业课教师", 30, "专业课");
        System.out.println(mt1.getAge() + "岁的" + mt1.getName() + "正在教专业课知识：" + mt1.getSubject());
        mt1.eat();
        mt1.sleep();
        mt1.teach();
        GeneralTeacher g1 = new GeneralTeacher("一般教育教师", 40);
        System.out.println(g1.getAge() + "岁的" + g1.getName() + "正在教一般教育知识");
        g1.eat();
        g1.sleep();
        g1.teach();
    }
}
