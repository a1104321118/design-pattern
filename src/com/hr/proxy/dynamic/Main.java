package com.hr.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class Main {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer();
        InvocationHandler gameHandler = new GamePlayIH(gamePlayer);
        ClassLoader classLoader = gamePlayer.getClass().getClassLoader();
        //动态生成一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, gamePlayer.getClass().getInterfaces(), gameHandler);
        proxy.killBoss();
        proxy.upGrade();
    }
}
