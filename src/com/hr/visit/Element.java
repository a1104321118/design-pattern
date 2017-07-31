package com.hr.visit;

/**
 * Created by hr on 2017/07/25.
 */
public abstract class Element {

    public abstract void doSomething();

    public abstract void accept(Visitor visitor);
}
