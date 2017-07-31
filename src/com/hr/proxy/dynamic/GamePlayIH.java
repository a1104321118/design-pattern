package com.hr.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * InvocationHandler是JDK提供的
 */
public class GamePlayIH implements InvocationHandler{

    //被代理的实例
    IGamePlayer gamePlayer;

    public GamePlayIH(IGamePlayer obj){
        this.gamePlayer = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("this is in invoke");
        return method.invoke(this.gamePlayer, args);
    }
}
