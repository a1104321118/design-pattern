package com.hr.mediator;

/**
 * Created by Administrator on 2017/7/5 0005.
 */
public class Main {

    public static void main(String[] args) {
        Service1 service1 = new Service1();
        service1.myMethod();
        service1.callService2();
    }
}
