package com.ytc.text.javase;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /**
         * 编写程序,声明 2 个 int 型变量并赋值。判断两数之和,如果大于等 于 50 ,打印" hello world!"
         */
        System.out.println("声明 2 个 int 型变量并赋值");
        Scanner scanner = new Scanner(System.in);
        System.out.println("第一次输入：");
        int one = scanner.nextInt();
        System.out.println("第二次输入：");
        int two = scanner.nextInt();
        if (one + two >= 50) {
            System.out.println("hello world!");
        }else {
            System.out.println("数字必须大于50");
        }

    }
}
