package com.ytc.text.november14;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 封装
 */
public class AllMethodTest {


    //冒泡排序
    public void getBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }




    /**
     * TestOne方法封装
     *
     * @param num
     */
    public  void getTestConsoleUp(int num) {
        switch (num) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("生成了一只白猪，我好怕怕");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("生成了一只黑猪，我喜欢");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("生成了一只红猪，有下酒菜了");
                break;
        }
    }

    /**
     * TestTwo
     *
     * @param number
     */
    public void endlessLoop(int number) {
        while (true) {
            for (int i = 0; i < number; i++) System.out.println("$");
            break;
        }
    }

    /**
     * TestThree
     *
     * @param arr
     * @param sc
     */
    public void getArraySort(int[] arr, Scanner sc) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入" + (i + 1) + "个数");
            arr[i] = sc.nextInt();
        }

        //数组排序
        getBubbleSort(arr);
    }


    /**
     * TestFour
     *
     * @param arr
     * @return
     */
    public String getArrayName(String[] arr) {
        int count = 0;
        for (String s : arr) if ("张三".equals(s)) count++;
        return String.valueOf(count);
    }

    /**
     * TestFives
     *
     * @param arr
     * @return
     */
    public boolean getArrayLength3(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length == 3) {
                System.out.println(Arrays.toString(arr[i]));
            }
        }
        return false;
    }


    /**
     * TestSix
     *
     * @param num
     * @return
     */
    public int[] getArrayDeduplication(int[] num) {

        //先排序
        getBubbleSort(num);
        int count = 0;

        //临时数组
        int[] tempArr = new int[num.length];

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] != num[i + 1]) {

                tempArr[count] = num[i];
                count++;
            }
        }

        //需要返回的数组
        int[] arr = new int[count];

        //数组去重方法
        System.arraycopy(tempArr, 0, arr, 0, count);
        return arr;

    }

    /**
     * TestSeven
     *
     * @param i
     */
    public void get99MclTable(int i) {
        for (int y = 1; y < i; y++) {
            if (y != 1 && y != 3) { //跳过1,3
                for (int j = 1; j <= y; j++) System.out.print(j + "*" + y + "=" + j * y + " ");
                System.out.println();
            }
        }
    }

    /**
     * TestEight
     *
     * @param start
     * @param end
     * @param no
     */
    public void get1And10Element(int start, int end, int no) {
        for (int i = start; i <= end; i++) {
            if (i != no) {
                System.out.println(i);
            }
        }
    }


    /**
     * 菱形  TestNine
     *
     * @param high
     * @param Row
     */
    public void getDiamond(int high, int Row) {
        for (int i = 1; i <= high; i++) {
            for (int j = 1; j <= i; j++) System.out.print(' ');
            for (int f = Row; f >= 2 * i - 1; f--) System.out.print('*');
            System.out.println();
        }
    }



}
