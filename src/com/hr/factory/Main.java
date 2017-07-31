package com.hr.factory;

/**
 * 工厂模式
 */
public class Main {

    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        God god = new God(humanFactory);
        //通过工厂创建人
        YellowHuman human = god.getHumanFactory().createHuman(YellowHuman.class);
        human.run();
        human.speak();
    }
}
