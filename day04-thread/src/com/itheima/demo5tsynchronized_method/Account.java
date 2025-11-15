package com.itheima.demo5tsynchronized_method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String carId;
    private double money;

    public synchronized void drawMoney(double money) {
        String name=Thread.currentThread().getName();

        //判断余额是否足够
        synchronized (this) {
            if (this.money>=money) {
                System.out.println(name+"取钱成功，吐出了"+money+"元");
                this.money=this.money-money;
                System.out.println("余额为："+this.money+"元");
            }else {
                System.out.println(name+"取钱失败，余额不足");
            }
        }


    }
}
