package com.dl1_.oopextends.oopextendstest6;

public class Phone3 extends Phone2 {
    public void sendMessage() {
        System.out.println("发短信");
    }
    @Override
    public void call() {
        System.out.println("打视频电话");
    }
    public void playGame() {
        System.out.println("玩游戏");
    }
}
