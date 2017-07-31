package com.hr.mediator;

/**
 * Created by Administrator on 2017/7/5 0005.
 */
public class Service1 {

    private  GateWay gateWay = new GateWay();

    public void myMethod(){
        System.out.println("service1");
    }

    //通过网关调用Service2的方法
    public void callService2(){
        gateWay.getService2().myMethod();
    }
}
