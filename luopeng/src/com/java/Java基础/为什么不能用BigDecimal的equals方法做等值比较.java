package com.java.Java基础;

import java.math.BigDecimal;

/**
 * @ClassDescription: equals会比较两部分内容，分别是值（value）和标度（scale）
 * @Author:LuoPeng
 * @Create:2026/9/13 10:27
 **/
public class 为什么不能用BigDecimal的equals方法做等值比较 {
    public static void main(String[] args) {
        boolean equals = new BigDecimal("0.05").equals(new BigDecimal("0.050"));
        System.out.println(equals);// 输出false

        int i = new BigDecimal("0.05").compareTo(new BigDecimal("0.050"));
        System.out.println(i); // 输出0

        System.out.println(new BigDecimal(0.1));
    }
}
