package com.hr.factory;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class God {

    private AbstractHumanFactory humanFactory;

    public God(AbstractHumanFactory humanFactory) {
        this.humanFactory = humanFactory;
    }

    public AbstractHumanFactory getHumanFactory() {
        return humanFactory;
    }
}
