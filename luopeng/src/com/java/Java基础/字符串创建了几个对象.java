package com.java.Java基础;

/**
 * @ClassDescription: String str=new String("hollis")创建了几个对象
 *                    答： 一个或两个
 *                    如果是第一次执行，会创建两个，一个是字符串常量引用指向的对象，一个是new出来的对象
 *                    如果不是第一次执行，会创建一个
 *
 *                    String a = "ab";String b="a"+"b",a==b吗
 *                    答： 是的，a==b，在java中，字符串使用==比较的是字符串对象的引用地址是否相同
 * @Author:LuoPeng
 * @Create:2026/9/13 11:42
 **/
public class 字符串创建了几个对象 {
    public static void main(String[] args) {
        String a = "1";
        System.out.println(a.hashCode());
        String b = "1";
        System.out.println(b.hashCode());
        System.out.println(a == b);
    }
}
