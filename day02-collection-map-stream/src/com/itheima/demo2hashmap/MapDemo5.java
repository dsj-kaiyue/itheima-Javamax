package com.itheima.demo2hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo5 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("嫦娥",100);
        map.put("女儿国王",64);
        map.put("小九",9);
        map.put("小九",25);



        System.out.println(map);
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+"="+integer);
            }
        });

        map.forEach((s, integer) -> System.out.println(s+"="+integer));


    }
}
