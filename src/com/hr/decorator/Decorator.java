package com.hr.decorator;

/**
 * Created by hr on 2017/07/10.
 */
public abstract class Decorator extends Room{

    //为哪个room进行装饰
    private Room room;

    public Decorator(Room room) {
        this.room = room;
    }

    @Override
    public void bed(){
        this.room.bed();
    }
}
