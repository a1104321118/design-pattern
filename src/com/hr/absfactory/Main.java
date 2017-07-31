package com.hr.absfactory;

/**
 * 抽象工厂模式
 * 抽象工厂模式，就是比工厂模式多了一层，
 * 把工厂模式的 AbstarctHuamnFactory 这一层抽象类抽掉，直接使用HumanFactory去createHuman（），就是真正的工厂模式，
 * 不抽掉就是 抽象工厂模式
 *
 * 抽象工厂模式的应用场景
 * 加入一个软件要在不同的操作系统上都可以使用，则可以使用抽象工厂模式，屏蔽掉操作系统不同带来的影响
 *
 */
public class Main {
}
