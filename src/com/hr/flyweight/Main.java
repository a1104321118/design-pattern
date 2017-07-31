package com.hr.flyweight;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hr on 2017/07/28.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        HumanInfo humanInfo = new HumanInfo();
        humanInfo.setGender("男");
        humanInfo.setMarry(false);

        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        Runtime runtime = Runtime.getRuntime();

        List<Human> humans = new ArrayList<>();

//        System.out.println("不使用享元模式");
//        long start2 = System.currentTimeMillis();
//        for (int i=0; i<1000000; i++){
//            humans.add(new Human(humanInfo));
//        }
//        System.out.println("剩余内存：" + runtime.freeMemory()/1024/1024 + "Mb");
//        System.out.println("共花费时间：" + (System.currentTimeMillis() - start2) + "ms");


        System.out.println("使用享元模式");
        long start = System.currentTimeMillis();
        for (int i=0; i<1000000; i++){
            humans.add(HumanPool.getHuman(humanInfo));
        }
        System.out.println("剩余内存：" + runtime.freeMemory()/1024/1024 + "Mb");
        System.out.println("共花费时间：" + (System.currentTimeMillis() - start) + "ms");
    }
}

