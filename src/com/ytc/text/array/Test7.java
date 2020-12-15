package com.ytc.text.array;

import java.util.Arrays;

public class Test7 {
    /**
     * 建TestSenven类,
     * 创建main()方法,定义数组
     * int[] arr 4= {2,64,7,11,34,15}
     * 将数组中最大值和 数组中最后一位数交换位置,输出结果
     */
    public static void main(String[] args) {
        int[] arr = {2, 64, 7, 11, 34, 15};
        System.out.println("修改前");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        swapPosition(arr);

    }


    public static int[] swapPosition(int[] arr) {

        //定义 最大值  and  最大索引
        int Max = arr[0];
        int indexMax = 0;

        //获取最后一位  and  最后的索引
        int indexEnd = arr.length - 1;

        //取最大值
        for (int i = 0; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
                indexMax = i;
            }
        }

        //位置交换
        int temp = Max;
        arr[indexMax] = arr[indexEnd];
        arr[indexEnd] = temp;

        System.out.println("修改后");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        return arr;
    }
}
