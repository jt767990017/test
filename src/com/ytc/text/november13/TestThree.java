package com.ytc.text.november13;

public class TestThree {
    /**
     * 新建TestThree类，在main()方法中定义int类型数组{5,12,34,17}，
     * 输出奇数的	平均值（平均值为double类型）
     */
    public static void main(String[] args) {
        int[] arr = {5, 12, 34, 17};

        //定义变量
        int sum = 0;
        int count = 0;

        //读取数组元素
        for (int i : arr) {
            if (i % 2 != 0) {
                sum += i;
                count++;
            }
        }

        System.out.println("奇数的平均值：" + (double) (sum / count));
    }
}
