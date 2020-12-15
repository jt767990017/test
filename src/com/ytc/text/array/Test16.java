package com.ytc.text.array;

public class Test16 {
    /**
     * 2、定义String类型二维数组
     * {{"燕子李三","25","男"},{"燕小六","22","女"},{"李大嘴","17","男"},{"红孩儿","13","女"}}。
     * 编写程序在控制台输出未成年（小于18岁）男生的姓名
     */
    public static void main(String[] args) {
        String[][] str = {{"燕子李三", "25", "男"}, {"燕小六", "22", "女"}, {"李大嘴", "17", "男"}, {"红孩儿", "13", "女"}};

        String name = "";
        int min = Integer.parseInt(str[2][1]) + 1;
        String sex = "";

        for (int i = 0; i < str.length; i++) {
            if (min > Integer.parseInt(str[i][1]) && str[i][2].equals("男")) {
                name = str[i][0];
                min = Integer.parseInt(str[i][1]);
                sex = str[i][2];
            }
        }

        System.out.println(name + min + sex);
    }
}
