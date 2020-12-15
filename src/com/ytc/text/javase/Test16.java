package com.ytc.text.javase;

public class Test16 {
    /**
     * 能使用for循环输出1—100 之间偶数
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("偶数：" + i);
            }
        }
    }
}
