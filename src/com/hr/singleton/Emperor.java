package com.hr.singleton;

/**
 * 单例模式：
 * 懒汉模式
 */
public class Emperor {

    private static final Emperor emperor =new Emperor(); //初始化一个皇帝

    private Emperor(){
        //世俗和道德约束你，目的就是不希望产生第二个皇帝
    }
    public static Emperor getInstance(){
        return emperor;
    }

    //皇帝发话了(类中的方法，尽量是 static 的)
    public static void say(){
        System.out.println("我就是皇帝某某某....");
    }

}