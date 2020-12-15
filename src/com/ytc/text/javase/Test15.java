package com.ytc.text.javase;

public class Test15 {
    /**
     * 计算 1—100 之间说有能被3又能被5整除的数的和。
     */
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("3又能被5整除的数的和：" + sum);
    }
}
