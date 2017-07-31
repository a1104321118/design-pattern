package com.hr.interpreter;

import java.util.HashMap;

/**
 * 减法表达式
 */
public class SubExpression extends SymbolExpression{

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 返回左边的表达式 - 右边的表达式
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
