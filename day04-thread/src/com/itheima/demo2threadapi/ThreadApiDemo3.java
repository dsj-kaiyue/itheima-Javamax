package com.itheima.demo2threadapi;

public class ThreadApiDemo3 {
    public static void main(String[] args) {
        MyThread2 t1=new MyThread2("子线程1");
        t1.start();
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+"线程输出"+i);
            if (i==1){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyThread2 extends Thread{
    public MyThread2 (String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"子线程输出："+(i+1));
        }
    }
}
