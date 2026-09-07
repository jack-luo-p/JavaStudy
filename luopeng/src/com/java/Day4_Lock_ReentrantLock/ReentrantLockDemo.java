package com.java.Day4_Lock_ReentrantLock;

import com.java.Day3_Thread.ImpRunnable;
import com.java.Day3_Thread.TicketSell;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassDescription:
 * @Author:LuoPeng
 * @Create:2026/9/12 09:34
 **/
public class ReentrantLockDemo implements Runnable {


    static int ticket = 0;

    static Lock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
            // synchronized (TicketSell.class) {
            lock.lock();
            try {
                if (ticket < 100) {
                    ticket ++;
                    System.out.println(Thread.currentThread().getName() + "正在卖" + ticket + "张票");
                } else {
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

            }

        // }
    }

    public static void main(String[] args) {
        ReentrantLockDemo impRunnable = new ReentrantLockDemo();
        new Thread(impRunnable, "窗口1").start();
        new Thread(impRunnable, "窗口2").start();
        new Thread(impRunnable, "窗口3").start();
    }
}
