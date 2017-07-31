package com.hr.bridge;

/**
 * 桥接模式
 */
public class Main {

    public static void main(String[] args) {

        Manager mysqlManager = new Manager(new MysqlDriver()) {
            @Override
            protected void getConnection() {
                super.getConnection();
            }
        };
        mysqlManager.getConnection();


        Manager oracleManager = new Manager(new OracleDriver()) {
            @Override
            protected void getConnection() {
                super.getConnection();
            }
        };
        oracleManager.getConnection();
    }
}
