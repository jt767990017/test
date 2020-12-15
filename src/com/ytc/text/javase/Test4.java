package com.ytc.text.javase;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /**
         * 我家的狗5岁了,5岁的狗相当于人类多大呢？
         * 其实,狗的前两年每一年相当于人类的 10 .5岁,之后每增加 一年就增加四岁。
         * 那么 5 岁的狗 相当于人类多少年龄呢？应该是： 10 .5 + 10 .5 + 4 + 4 + 4 = 33 岁。
         * 编写一个程序,获取用户输入的狗的年龄,通过程序显示其相当于人
         * 类的年龄。如果用户输入负数,请显示一个提示信息。
         */
        System.out.println("获取用户输入的狗的年龄,通过程序显示其相当于人");

        while (true) {
            System.out.println("请输入狗的年龄？");
            int dogAge = new Scanner(System.in).nextInt();
            if (dogAge == 00) {
                break;
            } else if (0 > dogAge) {
                System.out.println("输入年龄有误");
            } else if (dogAge <= 2) {
                //一年相当于人的10.5    半年 10.5/2
                System.out.println("相当于人类年龄的：\t" + dogAge * 10.5 + "  年");
            } else{
                System.out.println("相当于人类年龄的：\t" + (21 + (dogAge - 2) * 4) + "  年");
            }
        }

    }
}
