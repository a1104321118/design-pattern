package com.hr.interpreter;

import java.util.HashMap;

/**
 * 抽象表达式
 */
public abstract class Expression {

    //解析公式和数值，其中var中的key值是公式中的参数，value值是具体的数字
    //这里的HashMap是用来存放表达式中的数值
    //比如 A + B，那么这么Map里面就是放 put（“A”，10） put（“B”，20）
    public abstract int interpreter(HashMap<String,Integer> var);

}
