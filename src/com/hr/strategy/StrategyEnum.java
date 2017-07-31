package com.hr.strategy;

/**
 * 策略模式的扩展-----策略枚举
 */
public enum StrategyEnum {
    ADD("+") {
        @Override
        protected void excute(int a, int b) {
            System.out.println(a+b);
        }
    },

    SUB("-") {
        @Override
        protected void excute(int a, int b) {
            System.out.println(a-b);
        }
    };


    StrategyEnum(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }

    protected abstract void excute(int a, int b);
}
