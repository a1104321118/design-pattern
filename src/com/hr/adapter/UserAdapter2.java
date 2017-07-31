package com.hr.adapter;

/**
 * Created by hr on 2017/07/19.
 */
public class UserAdapter2 implements User{

    private OuterUser outerUser = new OuterUser();
    //简便起见，下面这个类就不写了
    //private OuterUser2 outerUser2 = new OuterUser2();

    @Override
    public String getUserName() {
        return outerUser.getUserInfo().get("name");
    }

    @Override
    public String getMobile() {
        return outerUser.getUserInfo().get("mobile");
        //假设mobile是由下面这个第三方的类实现的
        //return outerUser2.getUserInfo().get("mobile");
    }
}
