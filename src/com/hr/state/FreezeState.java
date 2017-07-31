package com.hr.state;

/**
 * Created by hr on 2017/07/26.
 */
public class FreezeState extends State{

    @Override
    public void sendCoupon() {
        System.out.println("用户状态冻结，不发送优惠券");
        //假设给它恢复到正常状态
        super.getContext().setState(new NormalState());
        System.out.println("用户状态恢复正常");
        super.getContext().sendCoupon();
    }
}
