package com.hr.strategy;

/**
 * Created by hr on 2017/07/18.
 */
public class Sub implements Strategy{

    @Override
    public void excute(int a, int b) {
        System.out.println(a-b);
        System.out.println("This is strategy2");
    }
}
