package com.ytc.text.javase;

public class Test11 {
    /**
     * 输出 1—100之间的所有偶数
     */

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("偶数：" + i);
            }
        }
    }
}
