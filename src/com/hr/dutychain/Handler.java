package com.hr.dutychain;

/**
 * Created by hr on 2017/07/10.
 */
public abstract class Handler {

    private Handler nextHandler;
    private int level;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void doHandle(int level){
        if(this.level != level){
            System.out.println("交给下一位处理");
            if(null == this.nextHandler){
                System.out.println("没有下一位了，没人处理了");
                return;
            }
            this.nextHandler.doHandle(level);
        }else {
            System.out.println("交给我处理，level=" + level);
        }
    }

    public Handler(int level) {
        this.level = level;
    }
}
