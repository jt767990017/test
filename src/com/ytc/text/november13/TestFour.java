package com.ytc.text.november13;

import java.util.Arrays;

public class TestFour {
    /**
     * 新建TestFour类,在main方法中创建int型一维数组{8,9,10,7,38,15}，求数组中	最后一个能被2整除的数（就本题而言是38）
     */
    public static void main(String[] args) {

        int[] arr = {8, 9, 10, 7, 38, 15};
        Arrays.sort(arr);
        if (arr[arr.length - 1] % 2 == 0) System.out.println("最后一个能被2整除的数：" + arr[arr.length - 1]);


    }
}
