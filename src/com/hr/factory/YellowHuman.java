package com.hr.factory;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class YellowHuman implements Human{
    @Override
    public void run() {
        System.out.println("yellow run");
    }

    @Override
    public void speak() {
        System.out.println("yellow speak");
    }
}
