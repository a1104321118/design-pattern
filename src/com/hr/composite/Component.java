package com.hr.composite;

import java.util.List;

/**
 * Created by hr on 2017/07/21.
 */
public abstract class Component {

    private String name;

    public String getName() {
        return name;
    }

    public Component(String name) {
        this.name = name;
    }


    abstract List<Component> getChildren();

    abstract void setChildren(List<Component> children);

    //最重要的是这个方法
    void display(){
        System.out.println(this.name);
        if(null != getChildren()){
            for (Component component : getChildren()){
                component.display();//递归打印
            }
        }
    }
}
