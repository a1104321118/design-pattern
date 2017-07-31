package com.hr.flyweight;

/**
 * Created by hr on 2017/07/28.
 */
public class Human {

    //外部对象
    private HumanInfo humanInfo;
    //内部对象
    private String name;

    //构造函数必须包含外部对象，否则没有意义
    public Human(HumanInfo humanInfo) {
        this.humanInfo = humanInfo;
    }

    public HumanInfo getHumanInfo() {
        return humanInfo;
    }

    public void setHumanInfo(HumanInfo humanInfo) {
        this.humanInfo = humanInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
