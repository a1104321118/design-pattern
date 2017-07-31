package com.hr.bridge;

/**
 * Created by hr on 2017/07/31.
 */
public abstract class Manager {

    private Driver driver;

    public Manager(Driver driver) {
        this.driver = driver;
    }

    protected void getConnection(){
        this.driver.getConnnection();
    }
}
