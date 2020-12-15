package com.ytc.text.javase;

public class Test17 {
    /**
     * While 循环 输出 1—100 之间的所有 奇数
     */
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.println("奇数：" + i);
            }
            i++;
        }
    }
}
