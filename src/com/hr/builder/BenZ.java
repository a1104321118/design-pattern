package com.hr.builder;


import java.util.ArrayList;

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
}
