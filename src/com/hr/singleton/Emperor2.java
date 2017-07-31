package com.hr.singleton;

/**
 * 单例模式：
 * 饥汉模式
 */
public class Emperor2 {

    private static Emperor2 emperor2 = null; //初始化一个皇帝

    private Emperor2(){
        //世俗和道德约束你，目的就是不希望产生第二个皇帝
    }

    /**
     * 注意，这种双检查机制锁在逻辑上是完美的，但是实际上并不能保证单例模式，
     * 因为Java内存模型的无序写入特性
     * @return
     */
    public static Emperor2 getInstance(){
        if(emperor2 == null){
            synchronized (Emperor2.class){
                if(emperor2 == null){
                    emperor2 = new Emperor2();
                }
            }
        }
        return emperor2;
    }

    //皇帝发话了(类中的方法，尽量是 static 的)
    public static void say(){
        System.out.println("我就是皇帝某某某....");
    }

}