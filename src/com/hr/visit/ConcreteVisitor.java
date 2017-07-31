package com.hr.visit;

/**
 * Created by hr on 2017/07/25.
 */
public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(ConcretrElement1 element) {
        element.doSomething();
    }

    @Override
    public void visit(ConcretrElement2 element) {
        element.doSomething();
    }
}
