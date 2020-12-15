package com.ytc.text.array;

public class Test10 {
    /**
     * 10.新建TestTen类,在main方法定义一个年龄数组。
     * int[] arr= {2,4,7,11,34,15};
     * 输出数组中偶数下标上元素的乘积
     */
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 11, 34, 15};
        int multiplication = 1;
        for (int i :arr) if (i% 2 == 0) multiplication *= i;
        System.out.println("偶数下标上元素的乘积：" + multiplication);
    }
}
