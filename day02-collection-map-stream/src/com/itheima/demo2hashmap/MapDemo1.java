package com.itheima.demo2hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("嫦娥",100);
        map.put("女儿国王",64);
        map.put("小九",9);
        map.put("小九",25);

        System.out.println(map);
    }
}
