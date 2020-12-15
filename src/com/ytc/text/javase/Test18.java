package com.ytc.text.javase;

public class Test18 {
    /**
     * Do while 循环 输出 统计1—100 之间能同时被 10 和20 整除的数字的个数
     */
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        do {
            if (i % 10 == 0 && i % 20 == 0) {
                count++;
            }
            i++;
        } while (i <= 100);

        System.out.println("同时被 10 和20 整除的数字的个数：" + count);
    }
}
