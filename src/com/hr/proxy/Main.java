package com.hr.proxy;

/**
 * 代理模式
 */
public class Main {

    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer();
        gamePlayer.setName("Hr");
        GameProxy gameProxy = new GameProxy(gamePlayer);
        gameProxy.killBoss();
        gameProxy.upGrade();
    }
}
