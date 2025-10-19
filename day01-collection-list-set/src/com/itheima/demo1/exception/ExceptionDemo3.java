package com.itheima.demo1.exception;

public class ExceptionDemo3 {
    //认识自定义异常
    public static void main(String[] args) {
        try {
            saveAge(300);
        } catch (ItheimaAgeIllegalException e) {
            e.printStackTrace();
        }
    }
    public static void saveAge(int age) throws ItheimaAgeIllegalException {
        if (age<1 || age>200){
            throw new ItheimaAgeIllegalException("年龄非法 age不能低于一岁，不能高于两百岁");
        }else {
            System.out.println("年龄合法");
            System.out.println("保存年龄："+age);
        }
    }
}
