package com.itheima.demo2threadapi;

public class ThreadApiDemo1 {
    public static void main(String[] args) {
        Thread t1=new MyThread("1号线程");
//        t1.setName("1号线程");
        t1.start();
        System.out.println(t1.getName());

        Thread t2=new MyThread("2号线程");
//        t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName());

        Thread m = Thread.currentThread();
        m.setName("主线程");
        System.out.println(m.getName());
    }
}

class MyThread extends Thread{
    public MyThread (String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"子线程输出："+(i+1));
        }
    }
}
