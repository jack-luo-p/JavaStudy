package com.java.Java基础;

/**
 * @ClassDescription: 为什么对Java中的负数取绝对值结果不一定是正数
 *                    Integer的取值范围是-2^31~2^31-1，即-2147483648~2147483647，而Math.abs(-2147483648)的结果是-2147483648，仍然是一个负数。
 *                    超过了int的最大值，就会出现这种情况。
 *                    Math.abs(orderId.hashCode())
 *
 *                    解决方式：将int转成long类型，再取绝对值
 *                    Math.abs((long)orderId.hashCode())
 * @Author:LuoPeng
 * @Create:2026/9/13 10:50
 **/
public class 为什么对Java中的负数取绝对值结果不一定是正数 {
    public static void main(String[] args) {
        int i = Math.abs(-2147483648);
        System.out.println(i); // 输出-2147483648

        // 解决方式，转成long类型
        long l = Math.abs(-2147483648L);
        System.out.println(l); // 输出2147483648

    }
}
