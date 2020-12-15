package com.ytc.text.november13;

import java.util.Arrays;
import java.util.Scanner;

public class Test11 {
    /**
     * 在main()方法中声明一个
     * float类型的数组长度为5并且给数组元素赋值,
     * 将数组的元素进行从小到大排序,并且输出到控制台
     */
    public static void main(String[] args) {

        float[] floats = new float[5];
        for (int i = 0; i < floats.length; i++) {
            System.out.println("输入 " + (i + 1) + " 数字");
            floats[i] = new Scanner(System.in).nextFloat();
        }
//        Arrays.sort(floats);

        for (int i = 0; i < floats.length - 1; i++) {
            for (int j = 0; j < floats.length - i - 1; j++) {
                if (floats[j] > floats[j + 1]) {
                    float temp = floats[j];
                    floats[j] = floats[j + 1];
                    floats[j + 1] = temp;
                }
            }
        }
/*
        for (int i = 0; i < floats.length - 1; i++) {
            for (int j = 0; j < floats.length - 1 - i; j++) {
                if (floats[j] > floats[j + 1]) {
                    float temp = floats[j];
                    floats[j] = floats[j + 1];
                    floats[j + 1] = temp;
                }
            }
        }*/
        System.out.println(Arrays.toString(floats));

    }
}
