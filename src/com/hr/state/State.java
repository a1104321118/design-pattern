package com.hr.state;

import com.hr.visit.ConcretrElement1;

/**
 * Created by hr on 2017/07/26.
 */
public abstract class State {

    private Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    //定义方法
    public abstract void sendCoupon();
}
