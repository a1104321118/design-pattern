package com.hr.proxy.dynamic;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
public class GamePlayer implements IGamePlayer{
    @Override
    public void killBoss() {
        System.out.println("kill boss");
    }

    @Override
    public void upGrade() {
        System.out.println("upGrade");
    }
}
