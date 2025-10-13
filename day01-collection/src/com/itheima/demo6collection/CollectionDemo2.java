package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();

        //添加
        list.add("555");
        list.add("666");
        list.add("777");
        list.add("888");
        //获取元素个数
        System.out.println(list.size());

        //删除元素
        list.remove("555");

        //清空集合
//        list.clear();

        //判断集合是否为空
        System.out.println(list.isEmpty());

        //判断集合是否存在某个元素
        System.out.println(list.contains("666"));


        //集合转为数组

        // 将集合转换为Object数组
        Object[] arr = list.toArray();
        // 打印数组的第一个元素
        System.out.println(arr[0].getClass().getName());
        // 使用Arrays工具类的toString方法打印整个数组内容
        System.out.println(Arrays.toString(arr));



    }
}
