package com.ytc.text.december14;

import java.util.HashSet;
import java.util.Set;

public class ThreadTest extends Thread {
    @Override
    public void run() {
        super.run();
        //play();
        setPlay();
    }

    public void play() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "   偶数    " + i);
            } else {
                System.out.println(Thread.currentThread().getName() + "   奇数    " + i);
            }
        }
    }

    private static int piao = 100;

    //共卖出100张
    public void setPlay() {
        while (true) {
            if (piao > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售   " + (piao--));
            } else {
                break;
            }
        }
    }
}

class A {

    //北京，山西，河南
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        Thread thread = new Thread(threadTest, "北京");
        Thread thread1 = new Thread(threadTest, "山西");
        Thread thread2 = new Thread(threadTest, "河南");
        thread.start();
        thread1.start();
        thread2.start();
    }

}