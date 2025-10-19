package com.itheima.demo1.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        //认识异常的体系，搞清楚异常的使用
//        show();
        try {
            show1();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    //定义一个方法识别编译时异常
    public static void show1() throws ParseException {
        String str="2025-10-11 20:35:00";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date=sdf.parse(str);
        System.out.println(date);
    }
    //定义一个方法识别运行时异常
    public static void show(){
        System.out.println("======start=====");
        int[] arr = {10,20,30};
        System.out.println(arr[3]);
        System.out.println("后续代码");

    }
}
