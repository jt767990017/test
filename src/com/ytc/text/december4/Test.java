package com.ytc.text.december4;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) throws ParseException {
        Beverage[] beverages = new Beverage[]{
                new Beverage(1, "可口可乐", "碳酸饮料", new SimpleDateFormat("yyyy-MM-dd").parse("2012-01-02"), 101),
                new Beverage(2, "雪碧", "碳酸饮料", new SimpleDateFormat("yyyy-MM-dd").parse("2012-11-02"), 120),
                new Beverage(3, "优酸乳", "乳类", new SimpleDateFormat("yyyy-MM-dd").parse("2012-04-02"), 102),
                new Beverage(4, "酸酸乳", "乳类", new SimpleDateFormat("yyyy-MM-dd").parse("2012-01-03"), 1100),
                new Beverage(5, "乐百氏矿泉", "纯净水", new SimpleDateFormat("yyyy-MM-dd").parse("2012-05-02"), 1200)
        };

        long a = beverages[0].getBeverageDate().getTime();
        //时间毫秒值进行比较    得到最小的毫秒数
        for (Beverage beverage : beverages) {
            if (beverage.getBeverageDate().getTime() < a) {
                a = beverage.getBeverageDate().getTime();
            }
        }

        //最小的毫秒数和数组的相等输出
        for (Beverage beverage : beverages) {
            if (beverage.getBeverageDate().getTime() == a) System.out.println(beverage.toString());
        }

        System.out.println();
        System.out.println("*************建TestBeverage类在主函数外定义 一个静态方法getRandomBeverage*************");
        System.out.println();

        for (String s : getRandomBeverage(beverages)) System.out.println(s);


    }

    public static String[] getRandomBeverage(Beverage[] beverages) {


        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            //获取数组索引
            int v = (int) (Math.random() * beverages.length);
            System.out.println(v);
            strings[i] = beverages[v].toString();
        }

        return strings;

    }
}
