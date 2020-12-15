package com.ytc.text.november14;

import java.util.Scanner;


public class TestOne {
    /**
     * 控制台输入数字 （使用switch判断）
     * 0-3 就输出"生成了一只白猪，我好怕怕"，
     * 4-7 就输出"生成了一只黑猪，我喜欢"
     * 7-9 就输出"生成了一只红猪，有下酒菜了"
     */
    public static void main(String[] args) {
        System.out.println("输入数字？");
        new AllMethodTest().getTestConsoleUp(new Scanner(System.in).nextInt());
    }


}
