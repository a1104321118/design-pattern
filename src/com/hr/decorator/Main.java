package com.hr.decorator;

/**
 * Created by hr on 2017/07/10.
 * 装饰模式
 */
public class Main {

    public static void main(String[] args) {
        Room room = new GirlRoom();

        room.bed();

        room = new MirrorRoom(room);
        room.bed();
    }
}
