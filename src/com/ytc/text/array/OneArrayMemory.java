package com.ytc.text.array;

/**
 * 数组
 */
public class OneArrayMemory {
    public static void main(String[] args) {
      /*  int[] arr = new int[1024 * 1024 * 2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        //获取占用内存总数,并将单位转换MB
        long memory1 = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        System.out.println("用一维数组存储占用内存总量为：" + memory1 + "MB");

        int nums2 = 1024 * 1024;
        int[][] arr2 = new int[nums2][2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i][0] = i;
            arr2[i][1] = i;
        }

        //获得占用内存总数,并将单位转换为MB
        long memory2 = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        System.out.println("用二维数组存储占用内存总量为：" + memory2 + "MB");*/
        int[][] arr = new int[4][3];
        System.out.println(arr[0]);
        System.out.println(arr[0][0]);
    }
}
