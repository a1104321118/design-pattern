package com.hr.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class BenZBuilder extends CarBuilder{

    private BenZ benZ = new BenZ();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benZ.setSequence(sequence);
    }

    @Override
    public AbstractCar buildCar() {
        return this.benZ;
    }
}
