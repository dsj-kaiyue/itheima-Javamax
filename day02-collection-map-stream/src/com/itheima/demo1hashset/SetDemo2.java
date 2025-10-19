package com.itheima.demo1hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
    public static void main(String[] args) {
        Student s1=new Student("张三",18,"beijing");
        Student s2=new Student("张三",18,"beijing");
        Student s3=new Student("张wu",18,"beijing");

        Set<Student> set =new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);


    }
}
