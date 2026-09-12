package com.java.Day6_notifi;

/**
 * @ClassDescription:
 * @Author:LuoPeng
 * @Create:2026/9/12 10:53
 **/
public class Foodie extends Thread{
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    // 先判断桌子是否有面条
                    // 如果没有，就等待
                    // 如果有，就开吃
                    // 吃完之后，唤醒厨师继续做
                    if (Desk.foodFlag == 0) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        Desk.count--;
                        System.out.println("Foodie线程正在吃面,还能再吃" + Desk.count);
                        Desk.lock.notifyAll();
                        Desk.foodFlag = 1;
                    }
                }
            }
        }
    }
}
