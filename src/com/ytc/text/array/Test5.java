package com.ytc.text.array;

import java.util.Scanner;

public class Test5 {
    /**
     * 新建TestFive类,创建main方法,
     * 通过scanner输入两个数字并判断这两个数字的积偶性,
     * 如果为奇数则输出 "该数字为奇数"否则输出"该数字为偶数"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {
            System.out.println("输入第" + i + "个数字");
            int one = sc.nextInt();
            if (one % 2 == 0) {
                System.out.println("该数字为偶数");
            } else {
                System.out.println("该数字为奇数");
            }
        }


    }
}
