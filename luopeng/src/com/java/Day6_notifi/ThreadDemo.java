package com.java.Day6_notifi;

/**
 * @ClassDescription:
 * @Author:LuoPeng
 * @Create:2026/9/12 11:11
 **/
public class ThreadDemo {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Foodie foodie = new Foodie();

        cook.setName("厨师");
        foodie.setName("食客");
        cook.start();
        foodie.start();
    }
}
