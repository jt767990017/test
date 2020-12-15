package com.ytc.text.november14;

import java.util.Arrays;
import java.util.Scanner;

public class TestThree {
    /**
     * 在main方法中创建一个能存储10个元素的int型的数组，
     * 通过Scanner输入10个数字，将这10个数字存入创建的数组中，
     * 将该数组中的元素排序后输出
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        new AllMethodTest().getArraySort(arr, new Scanner(System.in));
        System.out.println(Arrays.toString(arr));
    }
}
