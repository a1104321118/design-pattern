package com.hr.builder;

import java.util.ArrayList;

/**
 * 建造者模式
 * 想一下：
 * 如果在模板模式里面的run方法中，要求不同的顺序
 * 有些车是要先启动再按喇叭，有些车是要先按喇叭再启动
 * 如何实现？
 * 1.把run()方法去掉，或者改成 非final 的，让子类自己实现
 * 2.在run方法中定义一个入参，可以描述顺序，然后子类设置好该顺序，run(ShunXuDescription shunXu)再调用
 * 上面两种，如果有100种车，要写100次？
 *
 * 3.建造者模式，需要什么顺序，告诉建造者，然后由建造者来建造
 *
 * 建造者模式最主要的功能是基本方法的
 * 调用顺序安排，也就是这些基本方法已经实现了，通俗地说就是零件的装配，顺序不同产生
 * 的对象也不同；而工厂方法则重点是创建，创建零件是它的主要职责，组装顺序则不是它关
 * 心的。
 *
 */
public class Main {

    public static void main(String[] args) {
        //先把创造者创建出来
        CarBuilder builder = new BenZBuilder();

        //自定义顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("alarm");
        sequence.add("start");
        sequence.add("stop");
        builder.setSequence(sequence);

        //开始建造汽车，按照自定义的顺序
        AbstractCar car = builder.buildCar();
        car.run();

        //完整的建造者模式
        Derictor derictor = new Derictor();
        derictor.getBenZ().run();
        derictor.getBMW().run();
    }

}
