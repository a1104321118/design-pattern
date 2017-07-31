package com.hr.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * 解释器
 */
public class Calculator {

    /**
     * 该成员变量只是保存运算结果
     */
    private Expression expression;

    public Calculator(String expStr) {

        /**
         * 利用栈的结构
         */
        Stack<Expression> stack = new Stack<>();
        char[] chars = expStr.toCharArray();
        Expression left = null;
        Expression right = null;

        for (int i=0; i<chars.length; i++){
            switch (chars[i]) {
                case '+':
                    //如果是 + ，则构造新的表达式 A+B，并且++i，跳过下一个数字的循环
                    left = stack.pop();//取得+号左边的数字
                    right = new VarExpression(String.valueOf(chars[++i]));//取得+号右边的数字，并把下标+1，跳过下一次循环
                    stack.push(new AddExpression(left, right));//构造出新的 left+right 表达式，并入栈
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        //运算结果
        this.expression = stack.pop();
    }

    public int run(HashMap<String,Integer> var){
        //执行递归解析
        return this.expression.interpreter(var);
    }
}
