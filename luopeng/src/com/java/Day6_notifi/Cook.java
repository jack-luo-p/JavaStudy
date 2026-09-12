package com.java.Day6_notifi;

/**
 * @ClassDescription:
 * @Author:LuoPeng
 * @Create:2026/9/12 10:52
 **/
public class Cook extends Thread{
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 1) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Cook线程正在做饭");
                        Desk.foodFlag = 1;
                        // 唤醒所有等待的线程
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
