package com.ytc.text.javase;

import java.util.Scanner;

public class Test7 {
    /**
     * 对学生成绩大于60分的,输出"合格"。低于60分的,输出"不合格"。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("输入学生成绩？");
        int scour = new Scanner(System.in).nextInt();
        if (scour >= 60) {
            System.out.println("合格");
        }else {
            System.out.println("不合格");
        }
    }
}
