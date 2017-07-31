package com.hr.facade;

/**
 * Created by hr on 2017/07/24.
 */
public class FacadeApi {

    private Registe registe = new Registe();
    private Money money = new Money();

    public boolean registe(long id){

        boolean isReg = registe.registe(id);
        if(isReg){//注册成功才发送优惠券
            money.giveMoney(id);
        }

        return isReg;
    }
}
