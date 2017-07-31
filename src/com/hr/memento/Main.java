package com.hr.memento;

/**
 * Created by hr on 2017/07/24.
 */
public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.setState("关卡10");
        System.out.println("目前关卡：" + game.getState());
        //假设在关卡10存档
        Creataker creataker = new Creataker();
        System.out.println("存档");
        creataker.setMemento(game.createMemento());//存档

        game.setState("关卡11");
        System.out.println("目前关卡：" + game.getState());
        //读档
        game.restore(creataker.getMemento());
        System.out.println("回复存档，目前存档："+game.getState());
    }
}
