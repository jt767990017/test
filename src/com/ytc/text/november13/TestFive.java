package com.ytc.text.november13;

import java.util.Arrays;

public class TestFive {
    /**
     * 新建TestFive类，创建main()方法，定义数组int[] arr = {2,4,7,11,34,15}
     * 将数组中的元素按照从大到小的顺序输出
     */
    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 11, 34, 15};
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");


    }
}
