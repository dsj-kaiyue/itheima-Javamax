package com.itheima.demo1.exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("=====start======");
        try {
            System.out.println(div(10,0));
            System.out.println("底层方法执行成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层方法执行失败");
        }

        System.out.println("=====end=======");
    }
    public static int div (int a,int b) throws Exception {
        if (b==0){
            throw new Exception("除数不能为零，你的参数有问题");
        }
        int result =a/b;
        return result;
    }
}
