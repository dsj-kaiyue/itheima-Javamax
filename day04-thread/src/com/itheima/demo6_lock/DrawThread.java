package com.itheima.demo6_lock;

public class DrawThread extends Thread{
    private final Account acc;

    public DrawThread (String name, Account acc){
        super(name);
        this.acc=acc;
    }

    @Override
    public void run() {
        acc.drawMoney(100000);
    }
}
