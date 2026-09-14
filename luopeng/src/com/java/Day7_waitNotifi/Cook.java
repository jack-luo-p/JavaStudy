package com.java.Day7_waitNotifi;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @ClassDescription:
 * @Author:LuoPeng
 * @Create:2026/9/12 13:49
 **/
public class Cook extends Thread{

    ArrayBlockingQueue<String> queue; // 阻塞队列
    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                queue.put("面条");
                System.out.println("厨师放了一碗面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
