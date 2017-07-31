package com.hr.prototype;

/**
 * Created by Administrator on 2017/7/5 0005.
 */
public class Main {

    public static void main(String[] args) {
        Mail mail1 = new Mail();
        mail1.setReceiver("hr");
        mail1.setContent("context");
        mail1.setObj(new Object());

        Mail mail2 = mail1.clone();
        //hash 地址不同
        System.out.println(mail1.hashCode());
        System.out.println(mail2.hashCode());

        //但是属性相同,包括对象，也就是说obj是同一个对象
        System.out.println(mail2.getReceiver());
        System.out.println(mail2.getContent());
        System.out.println(mail2.getObj().hashCode());
        System.out.println(mail1.getObj().hashCode());
    }
}
