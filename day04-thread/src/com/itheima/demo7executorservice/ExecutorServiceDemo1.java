package com.itheima.demo7executorservice;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) {
        ExecutorService pool=new ThreadPoolExecutor(3,5,10,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //复用
        Runnable target=new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target); //到了临时线程的创建时机了
        pool.execute(target); //到了临时线程的创建时机了
        pool.execute(target); //到了临时线程的创建时机了
        //停止
        pool.shutdown();
//        pool.shutdownNow()
    }
}
