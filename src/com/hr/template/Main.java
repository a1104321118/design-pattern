package com.hr.template;

/**
 * 模板方法模式
 */
public class Main {

    public static void main(String[] args) {
        AbstractCar car = new BenZ();
        car.run();
    }
}
