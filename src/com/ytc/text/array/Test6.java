package com.ytc.text.array;

public class Test6 {
    /**
     * 新建类TestSix 创建main()方法,
     * 在main方法中创建一维数组
     * int [] arr = {34,24,62,74,79,83},
     * 将该数组中奇数的个数输出
     */
    public static void main(String[] args) {
        int[] arr = {34, 24, 62, 74, 79, 83};
        int count = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println("数的个数：" + count);
    }
}
