package com.hr.interpreter;

import java.util.HashMap;

/**
 * 加法表达式
 */
public class AddExpression extends SymbolExpression{

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 返回左边的表达式 +　右边的表达式
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        //执行递归解析
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
