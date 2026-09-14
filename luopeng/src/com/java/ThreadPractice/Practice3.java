package com.java.ThreadPractice;

/**
 * @ClassDescription: 练习3: 打印奇数数字，开启两个线程，共同获取1-100之间的所有数字
 * @Author:LuoPeng
 * @Create:2026/9/12 14:37
 **/
public class Practice3 implements Runnable {

    static int i = 1;
    @Override
    public void run() {
        while (true) {
            synchronized (Practice3.class) {
                if (i > 100) {
                    break;
                }
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Practice3 practice3 = new Practice3();
        Thread thread1 = new Thread(practice3, "线程1");
        Thread thread2 = new Thread(practice3, "线程2");
        thread1.start();
        thread2.start();
    }
}
