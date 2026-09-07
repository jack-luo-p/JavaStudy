package com.java.Day3_Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @ClassDescription: 实现Callable接口创建线程
 * @Author:LuoPeng
 * @Create:2026/9/6 15:30
 **/
public class ImpCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        FutureTask<Integer> future = new FutureTask<>(new ImpCallable());
        Thread thread1 = new Thread(future);
        thread1.start();
        try {
            Integer result = future.get();
            System.out.println("线程" + Thread.currentThread().getName() + "的执行结果为：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
