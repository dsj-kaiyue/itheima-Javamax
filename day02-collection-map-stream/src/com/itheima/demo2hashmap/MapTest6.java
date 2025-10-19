package com.itheima.demo2hashmap;

import java.util.*;

public class MapTest6 {
    public static void main(String[] args) {
        calc();
    }

    public static void calc(){
        List<String> locations=new ArrayList<>();
        String[] names={"玉龙雪山","长城","少林寺","丽江"};
        Random r=new Random();
        for (int i=0;i<=80;i++){
            int index=r.nextInt(names.length);
            locations.add(names[index]);
        }

        HashMap<String, Integer> map= new HashMap<>();

        for (String location : locations) {
//            if (map.containsKey(location)){
//                int count=map.get(location);
//                count++;
//                map.put(location,count);
//            }else {
//                map.put(location,1);
//            }
            map.put(location,map.containsKey(location)?map.get(location)+1:1);
        }

        System.out.println(map);

    }
}
