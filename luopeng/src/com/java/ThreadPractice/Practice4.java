package com.java.ThreadPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @ClassDescription: 抢红包： 假设100元，分为了3个包，现在5个人去抢。其中，红包是共享数据，5个人是5条线程
 * 打印结果：
 * XXX 抢到了XX元
 * XXX 抢到了XX元
 * XXX 抢到了XX元
 * XXX 没抢到
 * XXX 没抢到
 * @Author:LuoPeng
 * @Create:2026/9/12 14:52
 **/
public class Practice4 implements Runnable {
    static List<Integer> list =new ArrayList<>(Arrays.asList(10, 20, 70));


    @Override
    public void run() {
       synchronized (list) {
           if (!list.isEmpty()) {
               System.out.println(Thread.currentThread().getName() + " 抢到了" + list.remove(0) + "元");
           } else {
               System.out.println(Thread.currentThread().getName() + " 没抢到");
           }

       }
    }

    public static void main(String[] args) {
        new Thread(new Practice4(), "张三").start();
        new Thread(new Practice4(), "李四").start();
        new Thread(new Practice4(), "王五").start();
        new Thread(new Practice4(), "赵六").start();
        new Thread(new Practice4(), "孙七").start();
    }


}
