package com.ytc.text.array;

public class Test3 {
    /**
     * 新建类TestThree创建main()方法,
     * 在main方法中创建一维数组
     * int [] arr = {34,67,8,2,95,0,7},
     * 将数组当中最大值和最小值交换位置并输出
     */
    public static void main(String[] args) {
        int[] arr = {34, 67, 8, 2, 95, 0, 7};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        zhuan(arr);
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] zhuan(int[] arr) {
        int smallest = arr[0];
        int maximum = arr[0];

        int indexMax = 0;
        int indexSma = 0;


        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
                indexSma = i;
            }
            if (maximum < arr[i]) {
                maximum = arr[i];
                indexMax = i;
            }

        }
//        System.out.println("最大值：" + maximum + " " + "索引： " + indexMax + " " + "最小值：" + smallest + " " + "索引： " + indexSma);
        int indexM = arr[indexMax];
        int indexS = arr[indexSma];

        //最大和最小位置互换
        int temp = indexM;
        arr[indexMax] = indexS;
        arr[indexSma] = temp;
        return arr;
    }
}
