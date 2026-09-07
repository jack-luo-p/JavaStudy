package com.java.Day3_Thread;

/**
 * @ClassDescription: 实现Runnable接口创建线程
 * @Author:LuoPeng
 * @Create:2026/9/6 15:18
 **/
public class ImpRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        ImpRunnable impRunnable = new ImpRunnable();
        Thread t1 = new Thread(impRunnable);
        t1.setName("线程1");
        Thread t2 = new Thread(impRunnable);
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
