package com.itheima.demo6_lock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String carId;
    private double money;
    private final Lock lock=new ReentrantLock();


    public void drawMoney(double money) {
        String name=Thread.currentThread().getName();
        lock.lock();
         //判断余额是否足够
        try {
            if (this.money>=money) {
                System.out.println(name+"取钱成功，吐出了"+money+"元");
                this.money=this.money-money;
                System.out.println("余额为："+this.money+"元");
            }else {
                System.out.println(name+"取钱失败，余额不足");
            }
        } finally {
            lock.unlock();
        }


    }
}
