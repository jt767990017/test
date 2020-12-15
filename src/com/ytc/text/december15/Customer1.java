package com.ytc.text.december15;

import java.io.Serializable;

/**
 * 消费者
 */
public class Customer1 implements Serializable {
    public void getCustom() {
        System.out.println("等一下，产品好了通知来取");
    }

    public void getCount(int count) {

            System.out.println("消费者来取东西" + count);

    }

    /**
     * this从店员取走产品，店员一次只能持有固定数量产品（20）
     *
     *
     */


}
