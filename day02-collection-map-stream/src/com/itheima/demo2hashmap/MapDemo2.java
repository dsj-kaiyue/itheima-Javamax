package com.itheima.demo2hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("嫦娥",100);
        map.put("女儿国王",64);
        map.put("小九",9);
        map.put("小九",25);

        System.out.println(map);
        Collection<Integer> values=map.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();

            Integer value = entry.getValue();

            System.out.println(key+"="+value);

        }


    }
}
