package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTravelTest6 {
    public static void main(String[] args) {
        //创建一个Collection集合
        Collection<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //迭代器遍历
        Iterator<String> it=list.iterator();
        //取出当前数据，并移到下一个数据
        //it.next();

        while (it.hasNext()){
            String name = it.next();
            System.out.println(name);
        }
        //增强for循环
        for (String str:list){
            System.out.println(str);
        }


        //Lamda遍历
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.forEach(name-> System.out.println(name));

        list.forEach(System.out::println);

    }
}
