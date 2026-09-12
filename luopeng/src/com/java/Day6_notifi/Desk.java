package com.java.Day6_notifi;

/**
 * @ClassDescription: 作用： 控制生产者和消费者的执行
 * @Author:LuoPeng
 * @Create:2026/9/12 10:53
 **/
public class Desk {
    public static int foodFlag = 0; // 0表示没有食物，1表示有食物

    // 总个数
    public static int count = 10;

    // 锁对象
    public static Object lock = new Object();
}
