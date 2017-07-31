package com.hr.proxy.forceproxy;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
public class GamePlayer implements IGamePlayer{

    private String name;
    private IGamePlayer proxy;

    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public IGamePlayer getProxy(){
        this.proxy = new GameProxy(this);
        return this.proxy;
    }

    @Override
    public void killBoss() {
        if(!isProxy()){
            throw new RuntimeException("请使用代理进行操作！");
        }
        System.out.println(this.name + " kill boss");
    }

    @Override
    public void upGrade() {
        if(!isProxy()){
            throw new RuntimeException("请使用代理进行操作！");
        }
        System.out.println(this.name + " upGrade");
    }

    private boolean isProxy(){
        return !(null == this.proxy);
    }
}
