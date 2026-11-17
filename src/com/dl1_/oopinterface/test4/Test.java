package com.dl1_.oopinterface.test4;

public class Test {
    public static void main(String[] args) {
        TableTennisPlayer tp1 = new TableTennisPlayer("张三", 18);
        tp1.speakEnglish();
        tp1.work();
        TableTennisCoach tc1 = new TableTennisCoach("李四", 30);
        tc1.speakEnglish();
        tc1.work();
        BasketballPlayer bp1 = new BasketballPlayer("王五", 25);
        bp1.work();
        BasketballCoach bc1 = new BasketballCoach("赵六", 40);
        bc1.work();
    }
}
