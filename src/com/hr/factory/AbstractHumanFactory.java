package com.hr.factory;

/**
 * 工厂模式
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> t);
}
