package com.ytc.text.array;

public class Test17 {
    /**
     * int[][] arr3 = {{18,3,81,57},{16,9,-24}};
     * 输出数组中能被3整除的最小的数
     */
    public static void main(String[] args) {

        int[][] arr = {{18, 3, 81, 57}, {16, 9, -24}};
        int mim = arr[0][0];
        for (int i = 0; i < arr.length; i++) for (int j : arr[i]) if (j % 3 == 0 && mim > j) mim = j;
        System.out.println(mim);


    }
}
