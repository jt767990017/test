package com.ytc.text.november25;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws Throwable {
        new Persion() {
            @Override
            public void getPersionFindAll() {

            }
        }.getPersionFindAll();

        new AnonymousTest() {
            @Override
            public void getpersin() {
                System.out.println("AAAAAAAAAAAAA");
            }
        }.getpersin();

        try {

        } catch (Exception e) {
            throw new RuntimeException();
        }
        //10-16
        Random random = new Random();
        int a = random.nextInt(7) + 10;

        //40-70
        int b = random.nextInt(31) + 40;
        System.out.println(b);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String format = simpleDateFormat.format(System.currentTimeMillis());
        System.out.println(format);
        System.out.println("===============================================");

        double pi = 3.1415927;//圆周率
        //取一位整数
        System.out.println(new DecimalFormat("0").format(pi));//3
        //取一位整数和两位小数
        System.out.println(new DecimalFormat("0.00").format(pi));//3.14
        //取两位整数和三位小数，整数不足部分以0填补。
        System.out.println(new DecimalFormat("00.000").format(pi));// 03.142
        //取所有整数部分
        System.out.println(new DecimalFormat("#").format(pi));//3
        //以百分比方式计数，并取两位小数
        System.out.println(new DecimalFormat("#.##%").format(pi));//314.16%

    }
}
