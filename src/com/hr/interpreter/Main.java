package com.hr.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hr on 2017/07/27.
 */
public class Main {

    public static void main(String[] args) {
        String expStr = "a+b-a+c";
        HashMap<String, Integer> values = new HashMap<>();
        values.put("a", 10);
        values.put("b", 20);
        values.put("c", 30);

        Calculator calculator = new Calculator(expStr);
        int run = calculator.run(values);

        //显示结果
        for (Character c : expStr.toCharArray()){
            System.out.print(values.containsKey(c.toString()) ? values.get(c.toString()) : c.toString());
        }
        System.out.println(" = " +run);
    }
}
