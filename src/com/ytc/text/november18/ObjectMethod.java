package com.ytc.text.november18;

import java.util.Arrays;

public class ObjectMethod {

    //3.在main方法中定义数组int[] arr = {18,3,81,57,16,9,-24};将数据按照从大到小输出
    protected void getArrays() {
        int[] arr = {18, 3, 81, 57, 16, 9, -24};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
