package com.itheima.demo1hashset;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Teacher> teachers=new TreeSet<>(Comparator.comparingDouble(Teacher::getSalary));

        teachers.add(new Teacher("张三",18,88788));
        teachers.add(new Teacher("张三",19,89888));
        teachers.add(new Teacher("张三",17,85558));
        teachers.add(new Teacher("张三",15,86668));

        System.out.println(teachers);

    }
}
