package com.hr.mediator;

/**
 * Created by Administrator on 2017/7/5 0005.
 */
public class GateWay {

    private Service2 service2 = new Service2();


    public Service2 getService2() {
        return service2;
    }

    public void setService2(Service2 service2) {
        this.service2 = service2;
    }
}
