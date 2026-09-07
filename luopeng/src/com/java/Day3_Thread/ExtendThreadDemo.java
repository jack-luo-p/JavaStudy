package com.java.Day3_Thread;

/**
 * @ClassDescription: 多线程继承Thread类
 * @Author:LuoPeng
 * @Create:2026/9/6 15:12
 **/
public class ExtendThreadDemo extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        ExtendThreadDemo threadDemo1 = new ExtendThreadDemo();
        threadDemo1.setName("线程1");
        ExtendThreadDemo threadDemo2 = new ExtendThreadDemo();
        threadDemo2.setName("线程2");
        threadDemo1.start();
        threadDemo2.start();
    }
}
