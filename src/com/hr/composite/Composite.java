package com.hr.composite;

import java.util.List;

/**
 * Created by hr on 2017/07/21.
 */
public class Composite extends Component{

    private List<Component> children;

    public Composite(String name) {
        super(name);
    }

    public void setChildren(List<Component> children) {
        this.children = children;
    }

    @Override
    public List<Component> getChildren() {
        return children;
    }

}
