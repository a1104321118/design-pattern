package com.hr.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class BMWBuilder extends CarBuilder{

    private BMW bmw = new BMW();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public AbstractCar buildCar() {
        return this.bmw;
    }
}
