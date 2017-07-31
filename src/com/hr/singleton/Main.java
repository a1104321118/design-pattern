package com.hr.singleton;

/**
 * 单例模式
 */
public class Main {

    public static void main(String[] args) {
        Emperor instance = Emperor.getInstance();
        System.out.println(instance.hashCode());
        Emperor instance2 = Emperor.getInstance();
        System.out.println(instance2.hashCode());
    }
}
