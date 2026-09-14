package com.java.Java基础;

import java.math.BigDecimal;

/**
 * @ClassDescription: BigDecimal(double)和BigDecimal(String)有什么区别
 *                    1.    当new BigDecimal(0.1)的时候,其实创建出来的值不是刚好等于0.1的，而是等于0.1000000000000000055511151231257827021181583404541015625
 *                    这是因为double本身表示的只是一个近似值，而不是精确值。
 *                    2.    当new BigDecimal("0.1")的时候,创建出来的值就是0.1，因为字符串表示的值本身就是精确的。
 *
 *                    推荐： 使用BigDecimal(String)构造方法，因为字符串表示的值本身就是精确的，不会因为精度问题导致值不相等。
 * @Author:LuoPeng
 * @Create:2026/9/13 10:43
 **/
public class BigDecimal的double和BigDecimal的String有什么区别 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(0.1);
        System.out.println(bigDecimal);
        BigDecimal bigDecimal1 = new BigDecimal("0.1");
        System.out.println(bigDecimal1);
    }
}
