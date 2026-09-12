package com.java.Day5_deadLock;

/**
 * @ClassDescription: 死锁： 注意两个锁对象不要嵌套写
 * @Author:LuoPeng
 * @Create:2026/9/12 10:21
 **/
public class DeadLock extends Thread {

    static Object objA = new Object();
    static Object objB = new Object();

    @Override
    public void run() {
        while (true) {
            if ("线程A".equals(getName())) {
                synchronized (objA) {
                    System.out.println("线程A拿到了A锁，准备拿B锁");
                    synchronized (objB) {
                        System.out.println("线程A拿到了B锁,顺利执行完一轮");
                    }
                }
            } else if ("线程B".equals(getName())) {
                synchronized (objB) {
                    System.out.println("线程B拿到了B锁，准备拿A锁");
                    synchronized (objA) {
                        System.out.println("线程B拿到了A锁,顺利执行完一轮");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLock t1 = new DeadLock();
        DeadLock t2 = new DeadLock();
        t1.setName("线程A");
        t2.setName("线程B");
        t1.start();
        t2.start();
    }

}
