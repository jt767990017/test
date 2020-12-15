package com.ytc.text.javase;

import java.util.Scanner;

public class Test5 {
    /**
     * 假设你想开发一个玩彩票的游戏,程序随机地产生一个两位数的彩票,
     * 提示用户输入 一个两位数,然后按照下面的规则判定用户是否能赢。
     * 1)如果用户输入的数匹配彩票的实际顺序,奖金10 000美元。
     * 2)如果用户输入的所有数字匹配彩票的所有数字,但顺序不一致,奖金 3 000美元。
     * 3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字,奖金1 000美元。
     * 4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字,奖金500美元。
     * 5)如果用户输入的数字没有匹配任何一个数字,则彩票作废。
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("机地产生一个两位数的彩票");


        while (true) {

            //键盘录入
            Scanner scanner = new Scanner(System.in);
            System.out.println("用户输入两位数,输入3位数程序退出");

            int one = scanner.nextInt();

            //随机彩票生成
            int r = (int) (Math.random() * 90 + 10);

            //打印中奖号码 和 输入号码
            System.out.println("您的号码为：" + one);
            System.out.println("本次中奖号码是：" + r);

            //分解输入的十位数字
            int ge = one % 10;
            int shi = one / 10 % 10;

            //分解随机生成的十位数字
            int dge = r % 10;
            int dShi = r / 10 % 10;

            //判断
            if (String.valueOf(one).length() == 3) {
                break;
            } else if (one == r) {
                System.out.println("奖金10 000美元");
                break;
            } else if (ge == dge && ge == dShi && shi == dge && shi == dShi) {
                System.out.println("奖金 3 000美元");
                break;
            } else if (ge == dge || shi == dShi) {
                System.out.println("奖金1 000美元");
                break;
            } else if (ge == dge || ge == dShi || shi == dge || shi == dShi) {
                System.out.println("奖金500美元");
                break;
            } else {
                System.out.println("彩票作废");
            }

        }

    }
}
