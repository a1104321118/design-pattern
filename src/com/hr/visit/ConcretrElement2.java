package com.hr.visit;

/**
 * Created by hr on 2017/07/25.
 */
public class ConcretrElement2 extends Element{
    @Override
    public void doSomething() {
        System.out.println("I'm element2");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
