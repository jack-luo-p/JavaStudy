package com.java.ThreadPractice;

/**
 * @ClassDescription: 联系题： 一共有1000张电影票，可以在两个窗口领取，假设每次领取的时间为3000毫秒
 * 要求用多线程模拟买票过程并打印剩余电影票的数量
 * @Author:LuoPeng
 * @Create:2026/9/12 14:16
 **/
public class Practice1 implements Runnable{

    static int tickets = 1000;

    @Override
    public void run() {
        while (true) {
            synchronized (Practice1.class) {
                if (tickets > 0) {
                    try {
                        tickets--;
                        Thread.sleep(3000);
                        System.out.println(Thread.currentThread().getName() + "还剩" + tickets + "张电影票");

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        Practice1 practice1 = new Practice1();
        new Thread(practice1, "窗口1").start();
        new Thread(practice1, "窗口2").start();
    }
}
