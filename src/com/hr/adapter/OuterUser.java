package com.hr.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hr on 2017/07/19.
 */
public class OuterUser {

    public Map<String, String> getUserInfo(){
        Map<String, String> map = new HashMap<>();
        map.put("name","某某");
        map.put("mobile","12345678900");
        map.put("address","幸福路123号");
        return map;
    }
}
