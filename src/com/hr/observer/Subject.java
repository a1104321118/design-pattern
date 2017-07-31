package com.hr.observer;

import java.util.ArrayList;

/**
 * Created by hr on 2017/07/21.
 */
public abstract class Subject {

    private ArrayList<Observer> observers = new ArrayList<>();

    //新增观察者
    public void addObs(Observer observer){
        this.observers.add(observer);
    }

    public void removeObs(Observer observer){
        this.observers.remove(observer);
    }

    //通知被观察者
    public void notifyObs(){
        for (Observer observer : observers){
            observer.doSomething();
        }
    }

}
