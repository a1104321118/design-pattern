package com.hr.command;

/**
 * 调用者类，拥有抽象命令，并可以实例化该命令
 * 然后调用命令的执行
 */
public class Invoker {

    private Command command;

    public void action(){
        if(null == this.command){
            throw new RuntimeException("no command!");
        }

        this.command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
