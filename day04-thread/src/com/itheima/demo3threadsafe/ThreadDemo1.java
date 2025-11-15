package com.itheima.demo3threadsafe;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //
        Account account=new Account("ICBC-110",100000);

        //设计线程类
        new DrawThread("xm",account).start();
        new DrawThread("xh",account).start();

        System.out.println(account.getMoney());
    }
}
