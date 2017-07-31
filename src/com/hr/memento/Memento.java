package com.hr.memento;

/**
 * Created by hr on 2017/07/24.
 */
public class Memento {

    private String gameState;

    public String getGameState() {
        return gameState;
    }

    public void setGameState(String gameState) {
        this.gameState = gameState;
    }

    public Memento(String gameState) {
        this.gameState = gameState;
    }
}
