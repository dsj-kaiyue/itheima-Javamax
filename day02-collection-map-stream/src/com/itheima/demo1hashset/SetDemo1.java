package com.itheima.demo1hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {

//        Set<String> set=new HashSet<>();
        Set<String> set=new LinkedHashSet<>();
        set.add("鸿蒙");
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Java");
        System.out.println(set);

        Set<Integer> set1=new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(10);
        set1.add(9);
        System.out.println(set1);

    }
}
