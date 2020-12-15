package com.ytc.text.november13;

import java.util.Scanner;

public class Testmm {
    /**
     * 9.在main()方法实例化一个String类型的数组
     * String[] array = {"tom","alice","smith","alen","yilake"},
     * 通过scanner输入一个人名，判断该人名是不是存在于数组当中，
     * 如果存在则打印"存在啊"，否则打印"您输入的人名数组中没有哦 "
     */
    public static void main(String[] args) {
        String[] array = {"tom", "alice", "+", "alen", "yilake" };

        System.out.println("输入一个人名？");
        String name = new Scanner(System.in).next();

        for (String s : array)
            if (s.equals(name)) {
                System.out.println("存在啊");
                return;
            }

        System.out.println("您输入的人名数组中没有哦");
    }


}
