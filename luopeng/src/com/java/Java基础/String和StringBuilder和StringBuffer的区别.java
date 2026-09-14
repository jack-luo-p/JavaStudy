package com.java.Java基础;

/**
 * @ClassDescription: String、StringBuilder和StringBuffer的区别？
 *                    结论： String是不可变的，StringBuilder和StringBuffer是可变的。
 *                    StringBuilder是线程不安全的，性能更好，StringBuffer是线程安全的，性能稍差。
 *
 *                    String类没有提供用于追加，删除或修改字符串的方法。如果对字符串进行修改，会创建一个新的String对象
 *
 *
 *
 * @Author:LuoPeng
 * @Create:2026/9/13 10:59
 **/
public class String和StringBuilder和StringBuffer的区别 {
    public static void main(String[] args) {
        String a = "hello";
        String b = a;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
