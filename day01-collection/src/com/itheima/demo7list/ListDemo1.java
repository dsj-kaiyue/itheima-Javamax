package com.itheima.demo7list;

import java.util.*;

public class ListDemo1 {
    public static void main(String[] args) {
        //掌握list系列集合独有的功能
        List<String> names=new LinkedList<>();


        //添加数据
        names.add("张三");
        names.add("张四");
        names.add("张五");
        names.add("张六");


        //插入数据
        names.add(1,"张三丰");
        names.add(2,"张无忌");
        names.add(3,"张三");
        System.out.println(names);

        //删除李四
        names.remove(1);
        System.out.println( names);


        //修改数据
        names.set(1,"张三");

        Queue<String> queue =new LinkedList<>();

        Stack<String> stack= new Stack<>();

    }
}
