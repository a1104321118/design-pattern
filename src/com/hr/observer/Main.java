package com.hr.observer;

/**
 * Created by hr on 2017/07/21.
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject(){

        };//抽象类不能被实例化,只能加个括号

        //实例化两个观察者
        subject.addObs(new Observer());
        subject.addObs(new Observer());

        subject.notifyObs();

    }
}
