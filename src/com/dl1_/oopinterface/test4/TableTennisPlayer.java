package com.dl1_.oopinterface.test4;

public class TableTennisPlayer extends Person implements SpeakEnglish {

    public TableTennisPlayer() {

    }
    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
    @Override
    public void work() {
        System.out.println("乒乓球运动员学打乒乓球");
    }
}
