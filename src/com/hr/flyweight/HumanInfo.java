package com.hr.flyweight;

/**
 * Created by hr on 2017/07/28.
 */
public class HumanInfo {

    /**
     * 性别
     */
    private String gender;
    /**
     * 是否已婚
     */
    private Boolean marry;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMarry() {
        return marry;
    }

    public void setMarry(Boolean marry) {
        this.marry = marry;
    }

    //重写 equals 进行判断
    @Override
    public boolean equals(Object o) {
        if(o instanceof HumanInfo){
            HumanInfo humanInfo = (HumanInfo)o;
            return humanInfo.gender.equals(((HumanInfo) o).gender) && humanInfo.marry == ((HumanInfo) o).marry;
        }
        return false;
    }

    //重写 hashCode()方法，保证在对象池中是同一个对象
    @Override
    public int hashCode() {
        return gender.hashCode() + marry.hashCode();
    }
}
