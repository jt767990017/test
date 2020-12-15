package com.ytc.text.november13;

public class TestOne {
    /**
     * 1.新建TestOne类，在main方法中循环1-50。每输出3个数换一行
     */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 51; i++) {
            System.out.print(i + "\t");
            count++;
            if (count % 3 == 0) {
                System.out.println();
            }
        }
    }
}
