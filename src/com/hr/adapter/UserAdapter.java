package com.hr.adapter;

/**
 * Created by hr on 2017/07/19.
 */
public class UserAdapter extends OuterUser implements User{

    @Override
    public String getUserName() {
        return super.getUserInfo().get("name");
    }

    @Override
    public String getMobile() {
        return super.getUserInfo().get("mobile");
    }
}
