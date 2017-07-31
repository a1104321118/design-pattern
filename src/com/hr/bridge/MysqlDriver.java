package com.hr.bridge;

/**
 * Created by hr on 2017/07/31.
 */
public class MysqlDriver implements Driver{

    @Override
    public void getConnnection() {
        System.out.println("mysql connection");
    }
}
