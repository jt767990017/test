package com.ytc.text.november18;

import java.util.Arrays;

public class ParentMethod extends ObjectMethod {

    //1.在main方法中有一维数组 int[] array = {-11,-17,55,26,12,63}，
    // 将最大值和最小值交换位置，并输出交换完位置后的结果
    public void getParent() {
        int[] array = {-11, -17, 55, 26, 12, 63};

        //冒泡排序Test
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }


        //位置交换
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        System.out.println(Arrays.toString(array));
    }

    public void getObject() {
        super.getArrays();
    }
}
