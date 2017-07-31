package com.hr.facade;

/**
 * Created by hr on 2017/07/24.
 * 门面模式
 */
public class Main {

    public static void main(String[] args) {
        FacadeApi facadeApi = new FacadeApi();
        //单单只需要调用facade暴露的接口即可
        facadeApi.registe(600);
        facadeApi.registe(400);
    }

}
