package com.java.Day7_waitNotifi;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @ClassDescription:
 * @Author:LuoPeng
 * @Create:2026/9/12 13:49
 **/
public class Foodie extends Thread{

    ArrayBlockingQueue<String> queue; // 阻塞队列
    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                String food = queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
