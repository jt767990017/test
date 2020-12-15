package com.ytc.text.javase;

import java.util.Scanner;

public class Married {
    /**
     * 大家都知道,男大当婚,女大当嫁。那么女方家长要嫁女儿,
     * 当然要提出 一定的条件：高：180cm以上；
     * 富：财富1千万以上；帅：是。 如果这三个条件同时满足,
     * 则："我一定要嫁给他!!!" 如果三个条件有为真的情况,
     * 则："嫁吧,比上不足,比下有余。"
     * 如果三个条件都不满足,则："不嫁！"
     * 提示： Sysout("身高: (cm)) scanner.nextInt();
     * Sysout("财富: (千万)) scanner.nextDouble();
     * Sysout("帅否: (true/false)) (是/否)
     * scanner.nextBoolean();
     * scanner.next(); "是".equals(str)
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("大家都知道,男大当婚,女大当嫁。那么女方家长要嫁女儿,");
        Scanner dc = new Scanner(System.in);
        System.out.println("男方身高？");
        int s = 180;
        int shengao = dc.nextInt();

        System.out.println("财富是多少？");
        double a = 10000000f;
        double next = dc.nextDouble();

        System.out.println("帅吗？");
        String b = dc.next();

        if (shengao >= s &&  next >= a && b.equals("是")) {
            System.out.println("我一定要嫁给他!!!");
        } else if (shengao >= s || next >= a || "是".equals(b)) {
            System.out.println("嫁吧,比上不足,比下有余。");
        }else {
            System.out.println("不嫁！");
        }

    }
}
