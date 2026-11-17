package com.dl1_.oopinterface.test4;

public class TableTennisCoach extends Person implements SpeakEnglish {
    public TableTennisCoach() {}
    public TableTennisCoach(String name, int age) {
        super(name, age);
    }
    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练说英语");
    }
    @Override
    public void work() {
        System.out.println("乒乓球教练教乒乓球");
    }
}
