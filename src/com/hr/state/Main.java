package com.hr.state;

/**
 * Created by hr on 2017/07/26.
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new NormalState());
        context.sendCoupon();

        System.out.println("=============");

        FreezeState state = new FreezeState();
        state.setContext(context);
        context.setState(state);
        context.sendCoupon();
    }
}
