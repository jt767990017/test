package com.ytc.text.array;

public class Test2 {
    /**
     * 新建类TestTwo创建main()方法,
     * 在main方法中创建一维数组
     * int [] arr ={34,67,8,2,95,0,7},
     * 将数组当中最大值和最小值输出
     */
    public static void main(String[] args) {
        int[] arr = {34, 67, 8, 2, 95, 0, 7};
        int smallest = 0;
        int maximum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i]) maximum = arr[i];
            if (smallest > arr[i]) smallest = arr[i];
        }
        System.out.println("最大值：" + maximum + " " + "最小值：" + smallest);
    }
}
