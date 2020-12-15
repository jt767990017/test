package com.ytc.text.javase;

import java.util.Scanner;

public class Test10 {
    /**
     * 编写一个程序,为一个给定的年份找出其对应的中国生肖。中国的生肖基于12年一个周期,
     * 每年用一个动物代表：rat、ox、tiger、rabbit、dragon、snake、horse、sheep、monkey、 rooster、dog、pig。
     * 提示：2019年：猪 2019 % 12 == 3
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("国的生肖基于12年一个周期");
        int a = new Scanner(System.in).nextInt();
        String[] arr = {"鸡", "狗", "猪", "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴"};
        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <= b-1; j++) {
//            System.out.println("a % 12：" +a % 12 + " " + "索引\t" + "\t第一个for索引" + i + " " + "\t第一个for数据：" + arr[i]);
            if (a % 12 - 1 == i) {
                System.out.println("今年是" + " " + arr[i] + " " + "年");
            }
//            }
        }
    /*    switch (new Scanner(System.in).nextInt() % 12){
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
        }*/

    }
}
