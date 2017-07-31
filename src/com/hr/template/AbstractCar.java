package com.hr.template;

/**
 * 定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改
 * 变一个算法的结构即可重定义该算法的某些特定步骤。
 *
 * 行为由父类控制，子类实现
 */
public abstract class AbstractCar {

    //模板模式的基本方法要设计成 protected，不暴露public方法，符合迪米特原则

    //启动
    protected abstract void start();
    //喇叭
    protected abstract void alarm();
    //熄火
    protected abstract void stop();

    //这就是模板方法模式，把相同的能实现的逻辑直接放到抽象类里面去实现
    //相当于这就是一个封装了的模板，子类只需要关心上面的细节，不需要关心怎么调用
    //为了防止子类覆写，要加上final修饰
    public final void run(){
        this.start();
        if(this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }

    //模板方法的扩展
    //钩子方法，默认返回true,子类可以覆写
    protected boolean isAlarm(){
        return true;
    }
}
