package com.hr.proxy;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
public class GameProxy implements IGamePlayer{

    //给谁代理
    private IGamePlayer gamePlayer;

    public GameProxy(IGamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void killBoss() {
        //代理模式中可以增加预处理
        System.out.println("//GameProxy kill Boss");
        this.gamePlayer.killBoss();
    }

    @Override
    public void upGrade() {
        System.out.println("//GameProxy upGrade");
        this.gamePlayer.upGrade();
    }
}
