package com.hr.flyweight;

import com.hr.factory.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hr on 2017/07/28.
 */
public class HumanPool {

    //Human对象池
    private static Map<HumanInfo, Human> humanInfoPool = new HashMap<>();

    public static Human getHuman(HumanInfo key){
        //这里就是为什么要重写 hashCode() 和 equals()方法的原因
        if (humanInfoPool.containsKey(key)){
            return humanInfoPool.get(key);
        }

        //如果对象池中没有，那么就新建对象放入池中
        Human human = new Human(key);
        humanInfoPool.put(key, human);
        return human;
    }
}
