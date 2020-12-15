package com.ytc.text.november13;

import java.util.Arrays;

public class TestSix {
    /**
     * 现在有如下一个数组： int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
     * 要求将以上数组中的0项去掉，将不为0的值存入一个新的数组，生成新的数组为 	int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5}
     */
    public static void main(String[] args) {

        int oldArr[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};

        int count = 0;



        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] != 0) {
                count++;
            }
        }

        int j = 0;

        //新数组长度 数据存入
        int[] newArr = new int[count];

        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] != 0) {
                newArr[j] = oldArr[i];
                j++;
            }
        }

        System.out.print(Arrays.toString(newArr));
    }


}
