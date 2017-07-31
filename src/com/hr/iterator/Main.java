package com.hr.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式
 */
public class Main {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            if(next.equals("3")){
                iterator.remove();
            }
        }

        System.out.println("================");
        for (String s : strings){
            System.out.println(s);
        }
    }
}
