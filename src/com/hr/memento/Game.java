package com.hr.memento;

/**
 * Created by hr on 2017/07/24.
 */
public class Game {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建并返回一个备忘录
    public Memento createMemento(){
        return new Memento(this.state);
    }

    //从该备忘录中取出原来的存档
    public void restore(Memento memento){
        this.setState(memento.getGameState());
    }
}
