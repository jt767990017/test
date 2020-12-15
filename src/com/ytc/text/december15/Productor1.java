package com.ytc.text.december15;

import java.io.Serializable;

/**
 * 生产者
 */
public class Productor1 implements Serializable {

    public void getProductor1findAll(int c) {
        System.out.println("生产者开始生产：" + c);
    }

    public void getProductor1Stop() {
        System.out.println("生产者停止生产");
    }
    /**
     * 生产者生产更多
     *      店员叫停
     *
     *      如果店中有空位放产品了再通知继续生产
     *
     *          如果店中没有商品了，店员告诉消费者等一下，
     *          如果店中有产品了再通知消费者来取
     */

}
