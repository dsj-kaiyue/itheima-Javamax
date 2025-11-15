package com.itheima.demo1create;

public class Test {
    public static void main(String[] args) {
        Thread t1=new MyThread();
        t1.start();
        //run方法不会开启线程
        //t1.run();
        for (int i=0;i<5;i++){
            System.out.println("主线程输出："+(i+1));
        }
    }
}



class MyThread extends Thread{

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("子线程输出："+(i+1));
        }
    }
}
