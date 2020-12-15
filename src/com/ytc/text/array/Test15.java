package com.ytc.text.array;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Test15 {
    /**
     * 1、定义String类型二维数组
     * {{"小黑","19","男"},{"小白","22","女"},{"小李","17","男"},{"小李","13","女"}}。
     * 编写程序在控制台输出年龄最小的人的姓名年龄性别。
     */
    public static void main(String[] args) {

        String[][] str = {{"小黑", "19", "男"}, {"小白", "22", "女"}, {"小李", "17", "男"}, {"小李", "13", "女"}};

        int min = Integer.parseInt(str[0][1]);
        String name = "";
        String sex = "";
        for (int i = 0; i < str.length; i++) {
            if (min > Integer.parseInt(str[i][1])) {
                min = Integer.parseInt(str[i][1]);
                name = str[i][0];
                sex = str[i][2];
            }

        }
        System.out.println(name + min + sex);
    }
}
