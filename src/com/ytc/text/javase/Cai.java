package com.ytc.text.javase;

import java.util.Scanner;
import java.util.stream.Stream;

public class Cai {
    /**
     * 一艘油轮,载重量 500 吨。当油轮实际承载量超过 500 吨的时候,主控制室亮起红色警 报灯,平常时是绿色灯显示。
     * 请用 Java 程序编写主要逻辑判断。
     *  提示：  输入一个表示实际承载量的数字
     *  与常量 500 进行比较
     *  比较的结果决定是"红灯亮"还是"绿灯亮"
     *  每行代码要添加注释进行解释说明
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("输入承载重量");
        int number = new Scanner(System.in).nextInt();
        if (number > 500) {
            System.out.print("红色警");
        } else {
            System.out.print("绿灯亮");

        }
    }
}
