package com.hr.state;

/**
 * Created by hr on 2017/07/26.
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    //利用一个封装
    public void sendCoupon(){
        this.state.sendCoupon();
    }
}
