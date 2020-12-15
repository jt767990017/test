package com.ytc.text.javase;

public class Test14 {
    /**
     * 统计 1---1000 之间即能被30整除又能被17整除的 整数的个数
     */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i / 30 == 0 && i / 17 == 0) {
                count++;
            }
        }
        System.out.println("整数个数：" + count);
    }
}
