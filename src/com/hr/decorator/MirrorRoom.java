package com.hr.decorator;

/**
 * Created by hr on 2017/07/10.
 */
public class MirrorRoom extends Decorator{

    public MirrorRoom(Room room) {
        super(room);
    }

    @Override
    public void bed() {
        System.out.println("I have a mirror");
        super.bed();
    }
}
