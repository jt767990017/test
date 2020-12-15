package com.ytc.text.array;

import java.util.Scanner;

public class Test8 {
    /**
     * 新建TestEight类
     * 定义一个boolean数组 数组长度 10
     * 每个数组元素赋任意
     * 值最后 统计 数组中的 true有多少个 false有多少个
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean[] b = new boolean[10];

        int trueCount = 0;
        int falseCount = 0;

        for (int i = 1; i <= b.length; i++) {
            System.out.println("输入" + i);
            int so = sc.nextInt();
            if (so % 2 == 0) {
                trueCount++;
            } else {
                falseCount++;
            }
        }

        System.out.println("true个数：" + trueCount + " " + "false个数：" + falseCount);
    }
}
