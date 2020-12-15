package com.ytc.text.november13;

import java.util.Arrays;

public class TestSeven {
    /**
     * 新建TestThree类，在main()方法中定义int类型二维数组{{6,8,3,20},{5,
     * 12,34,17}}，输出奇数的平均值（平均值为double类型）
     */
    public static void main(String[] args) {
        int[][] arr = {{6, 8, 3, 20}, {5, 12, 34, 17}};

        double avg = 0;
        double count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j : arr[i]) {
                if (j % 2 != 0) {
                    avg += j;
                    count++;
                }
            }
        }
        System.out.println(avg / count);

    }
}
