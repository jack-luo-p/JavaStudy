package com.java.Day1;

/**
 * @version: v1.0
 * @Author: LUOPENG
 * @Description: 构造器初始化顺序
 * @DateTime: 2025/3/8 9:56
 * Java在创建对象时，初始化的顺序是：
 *
 * 父类静态变量、静态代码块（如果有父类的话）
 * 当前类的静态变量、静态代码块
 * 父类的实例变量（非static）、构造代码块、构造方法
 * 当前类的实例变量（非static）、构造的代码块
 * 当前类的构造方法
 **/
public class InitConstruct {
    public static void main(String[] args) {
        House house = new House();
        house.f();
    }
}
class Window {
    Window(int marker){
        System.out.println("Window("+marker+")");
    }
}

class House {

    Window w1 = new Window(1);
    {
        System.out.println("构造代码看");
    }
    House(){
        System.out.println("House()");
        w3=new Window(33);
    }
    Window w2 = new Window(2);
    void f(){
        System.out.println("f()");
    }
    Window w3 = new Window(3);
}