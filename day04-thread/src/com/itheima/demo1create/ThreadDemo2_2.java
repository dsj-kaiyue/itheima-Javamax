package com.itheima.demo1create;

public class ThreadDemo2_2 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i=0;i<5;i++){
                System.out.println("子线程输出："+(i+1));
            }
        }).start();
    }
}
