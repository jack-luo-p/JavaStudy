package com.java.Day3_Thread;

/**
 * @ClassDescription:
 * @Author:LuoPeng
 * @Create:2026/9/6 16:47
 **/
public class TicketSell extends Thread{

    public TicketSell(String name) {
        super(name);
    }

    static int ticket = 0;

    static Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (TicketSell.class) {
                if (ticket < 100) {
                    ticket ++;
                    System.out.println(getName() + "正在卖" + ticket + "张票");
                } else  break;
            }
        }
    }

    public static void main(String[] args) {
        TicketSell t1 = new TicketSell("窗口1");
        TicketSell t2 = new TicketSell("窗口2");
        TicketSell t3 = new TicketSell("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
