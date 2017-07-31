package com.hr.facade;

/**
 * Created by hr on 2017/07/24.
 */
public class Registe {

    public boolean registe(long id){
        System.out.println("开始注册");
        if(id > 500L){//假设id》500的是未注册的用户，可以注册
            System.out.println("注册成功,id=" + id);
            return true;
        }

        System.out.println("注册失败,id=" + id);
        return false;
    }
}
