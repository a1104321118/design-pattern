package com.hr.command;

/**
 * Created by hr on 2017/07/06.
 *
 * 命令模式：
 * 将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，
 * 对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
 */
public class Main {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        invoker.setCommand(new EditCodeCommand());
        invoker.action();
    }
}
