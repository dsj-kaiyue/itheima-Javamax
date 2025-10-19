package com.itheima.demo3stream;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class streamDemo1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张小四");

        List<String> newList=new ArrayList<>();
        for (String name : list) {
            if(name.startsWith("张") && name.length()==3){
                newList.add(name);
            }
        }
        System.out.println(newList);


        //使用Stream流解决
        List<String> newlist2 = list.stream().filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .collect(Collectors.toList());
        System.out.println(newlist2);
    }
}
