package com.hr.proxy.forceproxy;

/**
 * 强制代理模式，只能通过代理去访问
 */
public class Main {

    public static void main(String[] args) {

        //失败，因为没有用代理
        /*
        IGamePlayer gamePlayer = new GamePlayer("HR");
        gamePlayer.killBoss();
        gamePlayer.upGrade();
        */

        //失败，因为代理是new 出来的
        /*
        IGamePlayer gamePlayer = new GamePlayer("HR");
        IGamePlayer gameProxy = new GameProxy(gamePlayer);
        gameProxy.killBoss();
        gamePlayer.upGrade();
        */

        //成功
        IGamePlayer gamePlayer = new GamePlayer("HR");
        IGamePlayer proxy = gamePlayer.getProxy();
        proxy.killBoss();
        proxy.upGrade();
    }
}
