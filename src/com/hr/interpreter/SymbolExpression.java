package com.hr.interpreter;

/**
 * 运算符表达式
 */
public abstract class SymbolExpression extends Expression{

    /**
     * 二叉树结构
     * 因为一个运算符两边肯定都是数值表达式
     */
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
