package com.ytc.text.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test14 {
    /**
     * 1.创建一个长度为6的int型数组,要求取值为1-30,同时元素值各不相同
     */
    public static void main(String[] args) {

        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30);
            for (int j = 0; j < i; j++) {
                if (arr[i]==arr[j]){
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
