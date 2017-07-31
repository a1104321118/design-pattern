package com.hr.template;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class BenZ extends AbstractCar{

    @Override
    public void start() {
        System.out.println("BenZ start");
    }

    @Override
    public void alarm() {
        System.out.println("BenZ alarm");
    }

    @Override
    public void stop() {
        System.out.println("BenZ stop");
    }

    //覆写父类方法，实现自己的逻辑
    protected boolean isAlarm(){
        return false;
    }
}
