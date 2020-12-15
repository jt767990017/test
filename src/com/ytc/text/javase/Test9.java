package com.ytc.text.javase;

import java.util.Scanner;

public class Test9 {
    /**
     * 编写程序：从键盘上输入 2019 年的" month"和" day ",要求通过程序 输出输入的日期为 2019 年的第几天。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("从键盘上输入年？");
        int year = sc.nextInt();

        System.out.println("从键盘输入月？");
        int month = sc.nextInt();

        System.out.println("从键盘输入日？");
        int day = sc.nextInt();

        boolean b = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            b = true;
        }

        int saday = 0;
        switch (month) {
            case 12:
                saday += 30;
            case 11:
                saday += 31;
            case 10:
                saday += 30;
            case 9:
                saday += 31;
            case 8:
                saday += 31;
            case 7:
                saday += 30;
            case 6:
                saday += 31;
            case 5:
                saday += 30;
            case 4:
                saday += 31;
            case 3:

                if (b) {
                    saday += 29;
                } else {
                    saday += 28;
                }
            case 2:
                saday += 31;
            case 1:
                saday += day;
        }
        System.out.println("今天是：" + year + "的第" + saday + "天");
    }
}