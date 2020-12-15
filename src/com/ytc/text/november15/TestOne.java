package com.ytc.text.november15;

import java.util.Arrays;
import java.util.Scanner;

public class TestOne {
    /**
     * 通过scanner让用户输入三个数字a,b,c,将a,b,c按从小到大的顺序输出
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入1个数");
        int num = sc.nextInt();

        System.out.println("请输入2个数");
        int num1 = sc.nextInt();

        System.out.println("请输入3个数");
        int num2 = sc.nextInt();

        int[] paixu = paixu(num, num1, num2);
        System.out.println(Arrays.toString(paixu));
    }

    private static int[] paixu(int a, int b, int c) {

        int[] arr = new int[3];

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }


}
