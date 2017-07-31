package com.hr.builder;

import java.util.ArrayList;

/**
 * 定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改
 * 变一个算法的结构即可重定义该算法的某些特定步骤。
 *
 * 行为由父类控制，子类实现
 */
public abstract class AbstractCar {

    private ArrayList sequence;

    //启动
    protected abstract void start();
    //喇叭
    protected abstract void alarm();
    //熄火
    protected abstract void stop();

    public final void run(){
        // 根据 ArrayList 进行遍历，表示顺序
        for (int i = 0; i < this.sequence.size(); i++) {

            if("start".equals(this.sequence.get(i))){
                this.start();
            }
            if("alarm".equals(this.sequence.get(i))){
                this.alarm();
            }
            if("stop".equals(this.sequence.get(i))){
                this.stop();
            }
        }
    }

    final void setSequence(ArrayList sequence){
        this.sequence = sequence;
    }
}
