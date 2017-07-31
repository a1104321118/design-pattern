package com.hr.state;

/**
 * Created by hr on 2017/07/26.
 */
public class NormalState extends State{

    @Override
    public void sendCoupon() {
        System.out.println("用户状态正常，发送");
    }

}
