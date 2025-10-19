package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("C++");
        System.out.println(list);



        Set<String> set=new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("C");
        System.out.println(set);
    }
}
