package com.hr.proxy;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
public class GamePlayer implements IGamePlayer{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + " kill Boss");
    }

    @Override
    public void upGrade() {
        System.out.println(this.name + " upGrade");
    }
}
