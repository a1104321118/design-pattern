package com.hr.builder;


import java.util.ArrayList;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public abstract class CarBuilder {

    //设置顺序
    public abstract void setSequence(ArrayList<String> sequence);

    //建造车
    public abstract AbstractCar buildCar();
}
