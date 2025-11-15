package com.itheima.demo1create;

public class ThreadDemo2 {
    public static void main(String[] args) {

        Runnable r=new MyRunable();
        Thread t=new Thread(r);
        t.start();

        for (int i=0;i<5;i++){
            System.out.println("主线程输出："+(i+1));
        }

    }
}

class MyRunable implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("子线程输出："+(i+1));
        }
    }
}
