package com.ytc.text.november15;

import java.util.Arrays;
import java.util.Scanner;

public class TestF {
    /**
     * 4.先定义一个一维数组数组长度为10，数组元素使用scanner输入，请使用递归调用计算出当前数组元素之和。
     */


    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("输入第 " + (i + 1) + " 个数");
            arr[i] = sc.nextInt();
        }

        int sum = a(arr, 0);

        System.out.println(Arrays.toString(arr) + " 计算出当前数组元素之和：" + sum);

    }

    private static int a(int[] arr, int i) {
        if (arr.length - 1 == i) {
            return i;
        }
        return arr[i] + a(arr, i + 1);
    }


}
