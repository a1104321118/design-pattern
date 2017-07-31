package com.hr.adapter;

/**
 * 适配器模式
 */
public class Main {

    public static void main(String[] args) {
        //这样即使接入了第三方也能符合自己系统的调用标准
        User user = new UserAdapter();
        user.getMobile();
        user.getUserName();
    }
}
