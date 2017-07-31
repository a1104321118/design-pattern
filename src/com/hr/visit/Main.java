package com.hr.visit;

/**
 * Created by hr on 2017/07/25.
 */
public class Main {

    public static void main(String[] args) {
        Element element1 = new ConcretrElement1();
        element1.accept(new ConcreteVisitor());
    }
}
