package com.hr.strategy;

/**
 * 策略模式：
 *   有加减两个策略，根据需要进行实例化，调用者只需要关心自己的需求而无需关心策略的实现
 */
public class Main {

    public static void main(String[] args) {
        Strategy strategy = new Add();
        Context context = new Context(strategy);
        context.getStrategy().excute(1,2);

        //策略模式的扩展，策略枚举
        StrategyEnum.ADD.excute(1,2);
    }
}
