package com.ytc.text.javase;

import java.util.Scanner;

public class FourSeasons {
    public static void main(String[] args) {
        while (true){
            System.out.println("输入月份");
            int month = new Scanner(System.in).nextInt();
            if (month > 12) {
                System.out.println("月份不对");
                break;
            } else if (month == 12) {
                System.out.println("冬天");
            } else if (month >= 3 && 5 >= month) {
                System.out.println("春天");
            } else if (month >= 6 && 8 >= month) {
                System.out.println("夏天");
            } else if (month >= 9 && 11 >= month) {
                System.out.println("秋天");
            }
        }

    }
}
