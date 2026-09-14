package com.java.Day7_waitNotifi;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @ClassDescription:
 * @Author:LuoPeng
 * @Create:2026/9/12 13:50
 **/
public class ThreadDemo {
    public static void main(String[] args) {

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        Cook cook = new Cook(queue);
        Foodie foodie = new Foodie(queue);
        cook.start();
        foodie.start();
    }
}
