package com.itheima.demo1create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Callable<String> c=new MyCallable(100);
        FutureTask<String> ft=new FutureTask<>(c);
        Thread t=new Thread(ft);
        t.start();
        try {
            String string=ft.get();
            System.out.println(string);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
class MyCallable implements Callable<String>{
    private int n;
    public MyCallable(int n){
        this.n=n;
    }
    @Override
    public  String call() throws Exception {
        int sum=0;
        for (int i=1;i<=n;i++){
            System.out.println("子线程输出："+i);
            sum+=i;
        }
        return "子线程计算出结果是："+sum;
    };
}