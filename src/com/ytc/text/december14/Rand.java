package com.ytc.text.december14;

public class Rand implements Runnable {

    private static int PIAO = 100;

    @Override
    public void run() {

        while (true) {
            synchronized ("") {
                if (PIAO > 0) {
                    System.out.println(Thread.currentThread().getName() + "       在卖     " + (PIAO--));
                } else {
                    break;
                }
            }

        }
    }
}

class B {
    public static void main(String[] args) {

        Thread thread = new Thread(new Rand(), "北京");
        Thread thread1 = new Thread(new Rand(), "山西");
        Thread thread2 = new Thread(new Rand(), "河南");
        thread.start();
        thread1.start();
        thread2.start();
    }
}