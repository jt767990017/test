package com.ytc.text.november13;

import java.util.Arrays;

public class TestTwo {
    /**
     * 新建TestTwo类,创建main()方法,完成以下要求;
     * 在main()方法中定义数组float[] flo = {3.26f,6.32f,8.36f,9.23f,2.1f};
     * 让该数组当中最小值和最大值交换位置
     */
    public static void main(String[] args) {
        float[] flo = {3.26f, 6.32f, 8.36f, 9.23f, 2.1f};

        System.out.println("转换前：" + Arrays.toString(flo));

        //最大值、最小值
        float max = flo[0];
        float min = flo[0];

        //最大值索引、最小值索引
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < flo.length; i++) {
            if (max > flo[i]) {
                max = flo[i];
                maxIndex = i;
            } else {
                min = flo[i];
                minIndex = i;
            }
        }

        //位置交换
        float temp = max;
        flo[maxIndex] = flo[minIndex];
        flo[minIndex] = temp;

        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        System.out.println("转换后：" + Arrays.toString(flo));
    }
}
