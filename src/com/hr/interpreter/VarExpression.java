package com.hr.interpreter;

import java.util.HashMap;

/**
 * 数值表达式
 */
public class VarExpression extends Expression{

    //表达式的Key，比如A，B
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
