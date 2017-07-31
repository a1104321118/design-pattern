package com.hr.factory;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class HumanFactory extends AbstractHumanFactory{
    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {

        if(clazz == YellowHuman.class){
            return (T) new YellowHuman();
        }else if (clazz == BlackHuman.class){
            return (T) new BlackHuman();
        }else {
            throw new RuntimeException("不支持的人种类型");
        }

    }
}
