package com.java;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassDescription: 多线程写入文件
 * @Author:LuoPeng
 * @Create:2026/9/22 14:47
 **/


public class ThreadReadTxt extends Thread{
    private List<Integer> list = new ArrayList<>(){
        {
            for (int i = 0; i < 1000; i++) {
                add(i);
            }
        }
    };

    private static final Object lock = new Object();


    @Override
    public void run() {


        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " 获取锁");
            try {
                System.out.println(Thread.currentThread().getName() + " 正在写入文件...");
                FileOutputStream fileOutputStream = new FileOutputStream("output.txt", false);
                fileOutputStream.write(("Line " + list.get(0) + "\n").getBytes());
                fileOutputStream.close();
                System.out.println(Thread.currentThread().getName() + " 写入文件完成");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // 假设数据库返回的数据数量是10008
        int totalLines = 10008;
        int batch = 1000;
        int pageSize = 100008/1000 + (100008%1000 != 0 ? 1 : 0);
        System.out.println(pageSize);


        List<String> list = new ArrayList<>();  // 文件内容列表
        for (int i = 0; i < totalLines; i++) {
            list.add("Line " + i);
        }

        // 开启3个线程
        for (int i = 0; i < 3; i++) {
            Thread thread = new ThreadReadTxt();
            thread.start();
        }

    }
}
