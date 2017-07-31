package com.hr.builder;

import java.util.ArrayList;

/**
 * 封装一层
 */
public class Derictor {

    private ArrayList sequence = new ArrayList();
    private CarBuilder carBuilder;

    public BenZ getBenZ(){
        sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        carBuilder = new BenZBuilder();
        carBuilder.setSequence(this.sequence);
        return (BenZ) carBuilder.buildCar();
    }

    public BMW getBMW(){
        sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        carBuilder = new BMWBuilder();
        carBuilder.setSequence(this.sequence);
        return (BMW) carBuilder.buildCar();
    }
}
