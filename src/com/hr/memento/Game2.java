package com.hr.memento;

/**
 * Created by hr on 2017/07/24.
 */
public class Game2 {

    private String state;
    private String backupState;//状态备份

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Game2(String state) {
        this.state = state;
    }

    //存档
    public void createMemento(){
        this.backupState = this.state;
    }

    //读档
    public void restore(){
        this.state = this.backupState;
    }

}
