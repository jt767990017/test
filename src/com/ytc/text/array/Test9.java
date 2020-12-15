package com.ytc.text.array;

import java.util.Scanner;

public class Test9 {
    /**
     * 9.新建TestNine在类中创建main方法,
     * 在main方法中创建一个能存储10个元素的int型的数组,
     * 通过Scanner输入10个数字,
     * 将这10个数字存入创建的数组中,
     * 输出数组中的偶数元素,以及偶数元素的个数
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        String str = "";
        int count = 0;

        for (int i = 1; i <= arr.length; i++) {
            System.out.println("输入:" + i);int co = sc.nextInt();if (co % 2 == 0){
                str += co + " ";
                count++;
            }
        }

        System.out.println("数组中的偶数元素：" + str + " " + "偶数元素的个数：" + count);

    }
}
