package com.hr.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hr on 2017/07/21.
 * 组合模式
 */
public class Main {

    public static void main(String[] args) {
        //设置根节点
        Component root = new Composite("root");

        //设置树枝节点
        Component branch1 = new Composite("branch1");
        Component branch2 = new Composite("branch2");
        List<Component> branches = new ArrayList<>();
        branches.add(branch1);
        branches.add(branch2);


        //设置叶子结点
        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        Component leaf3 = new Leaf("leaf3");
        List<Component> leaves = new ArrayList<>();
        leaves.add(leaf1);
        leaves.add(leaf2);
        leaves.add(leaf3);

        //组建成树
        root.setChildren(branches);
        branch1.setChildren(leaves);

        //打印树
        System.out.println("=========打印整颗树========");
        root.display();

        //或者打印一个树枝
        System.out.println("=========打印branch1======");
        branch1.display();
    }
}
