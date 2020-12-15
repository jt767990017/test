package com.ytc.text.javase;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /**
         * 小甜甜参加 Java 考试,他和父亲岳不群达成承诺：
         * 如果：
         * 成绩为100分时,奖励一辆BMW；
         * 成绩为(80,99]时,奖励一台iphone xs max；
         * 当成绩为[60,80]时,奖励一个 iPad； 其
         * 它时,什么奖励也没有。
         * 请从键盘输入小甜甜的期末成绩,并加以判断
         */
        while (true) {
            System.out.println("甜甜参加 Java 考试,他和父亲岳不群达成承诺");
            int number = new Scanner(System.in).nextInt();
            if (number == 0) {
                break;
            } else if (number == 100) {
                System.out.println("奖励一辆BMW");
            } else if (number >= 80 && number < 100) {
                System.out.println("奖励一台iphone xs max");
            } else if (number >= 60 && number < 80) {
                System.out.println("奖励一个 iPad");
            } else {
                System.out.println("其它时,什么奖励也没有");
            }

        }

    }
}
