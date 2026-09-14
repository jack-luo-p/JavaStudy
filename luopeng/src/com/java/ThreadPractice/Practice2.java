package com.java.ThreadPractice;

/**
 * @ClassDescription: 练习题2:送礼品
 * 有100份礼品，两人同时发送，当剩下的礼品小于10份的时候则不再送出。
 * 利用多线程模拟该过程并将线程的名字和礼物剩余数量打印出来
 * @Author:LuoPeng
 * @Create:2026/9/12 14:28
 **/
public class Practice2 implements Runnable {

    static int gifts = 100;
    @Override
    public void run() {
        while (true) {
            synchronized (Practice2.class) {
                if (gifts > 10) {
                    gifts--;
                    System.out.println(Thread.currentThread().getName() + "送出了第" + (100 - gifts) + "份礼品");
                } else {
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        Practice2 practice2 = new Practice2();
        Thread thread1 = new Thread(practice2, "线程1");
        Thread thread2 = new Thread(practice2, "线程2");
        thread1.start();
        thread2.start();
    }
}
