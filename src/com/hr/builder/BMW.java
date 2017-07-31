package com.hr.builder;


import java.util.ArrayList;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class BMW extends AbstractCar{

    @Override
    public void start() {
        System.out.println("BMW start");
    }

    @Override
    public void alarm() {
        System.out.println("BMW alarm");
    }

    @Override
    public void stop() {
        System.out.println("BMW stop");
    }
}
