package com.ytc.text.javase;

public class Test13 {
    /**
     * 定义一个变量 赋值 判断这个值是不是 素数
     */
    public static void main(String[] args) {
        int a=6;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                System.out.println("素数：" + i);
            }
        }

    }
}
