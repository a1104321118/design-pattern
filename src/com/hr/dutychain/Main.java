package com.hr.dutychain;

/**
 * Created by hr on 2017/07/10.
 * 责任链模式
 */
public class Main {

    public static void main(String[] args) {

        Handler handler1 = new DoHandel1();
        Handler handler2 = new DoHandel2();
        Handler handler3 = new DoHandel3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        handler1.doHandle(3);
        handler1.doHandle(4);

    }
}
