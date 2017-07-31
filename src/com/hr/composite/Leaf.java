package com.hr.composite;

import java.util.List;

/**
 * Created by hr on 2017/07/21.
 */
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    List<Component> getChildren() {
        return null;
    }

    @Override
    void setChildren(List<Component> children) {
        //空方法
    }

}
