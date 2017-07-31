package com.hr.proxy.forceproxy;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
public class GameProxy implements IGamePlayer{

    private IGamePlayer gamePlayer;

    public GameProxy(IGamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upGrade() {
        this.gamePlayer.upGrade();
    }

    //代理的代理
    @Override
    public IGamePlayer getProxy() {
        return this;
    }

}
