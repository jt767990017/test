package com.ytc.text.december15;

/**
 * 店员
 */
public class Clerk extends Thread {

    private Productor1 productor1;   //生产者

    private Customer1 customer1;     //消费者

    //判断有没有空位   有则  生产true  否则  停止false
    boolean flag = false;


    @Override
    public void run() {
        int count = 0;
        while (true) {

            //线程同步
            synchronized (this) {

                if (count == 0) {
                    new Customer1().getCustom();
                    flag = true;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (count == 20) {
                    new Customer1().getCount(count);
                    flag = false;
                    continue;
                }

                //判断店员的店里，有没有 空位
                if (flag) {  //如果有空位 true
                    new Productor1().getProductor1findAll(count);  //生产者开始生产
                    count++;
                    if (count > 20) {
                        new Productor1().getProductor1Stop();     //生产者停止
                        continue;
                    }

                }

            }

        }
    }
}

