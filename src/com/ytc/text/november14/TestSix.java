package com.ytc.text.november14;

import java.util.Arrays;

public class TestSix {
    /**
     * 在main方法中新建一个int[] num={1,3,2,5,3,2,4,5},使用java代码去除重复项并输出
     */
    public static void main(String[] args) {
        int[] num = {1, 3, 2, 5, 3, 2, 4, 5};
        int[] arr = new AllMethodTest().getArrayDeduplication(num);
        System.out.println(Arrays.toString(arr));
    }
}
