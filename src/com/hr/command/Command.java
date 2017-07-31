package com.hr.command;

/**
 * 抽象命令类，持有抽象执行类
 */
public abstract class Command {

    //把三个组都定义好，子类可以直接使用
    protected Group group;

    public void setGroup(Group group) {
        this.group = group;
    }

    //只有一个方法，你要我做什么事情
    public abstract void execute();
}
