package com.ytc.text.november18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
//        Submethod submethod = new Submethod();
//        submethod.getInstance();
//        submethod.getMethod();
//        System.out.println("====================");
        //4.定义String类型二维数组{{"小张","19","男"},{"小王","21","女"},{"小李","17","男"},{"小红","13","女"}}。
        // 编写程序在控制台输出年龄为21岁性别为男的姓名
        String[][] arr = {{"小张", "19", "男"}, {"小王", "21", "女"}, {"小李", "17", "男"}, {"小红", "13", "女"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals("21")) {
                    System.out.println(Arrays.toString(arr[i]));
                }
            }
        }
        System.out.println("====================");
//        ****
//        ***
//        **
//        *
        for (int i = 5; i >= 1; i--) {
            System.out.println();
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
        }
        System.out.println("====================");
        //在TestArray类中，定义方法getMaxNum(),定义数组
        // int[] arr3 = {18,3,81,57,16,9,-24};
        // 求数组中能被3整除的最大的数并返回。并在main方法中调用

        System.out.println("最大的数并返回：" + getMaxNum());

        System.out.println("====================");
//        在TestArray类中，定义arrTestSum方法。有一维数组
//        int[] array =
//        {20,,11,22,49,12,21,-10,-33}数组中最后一个能被3整除的数并返回
//        提示：该题应为-33,多输出则不对。

        int[] array = {20, 11, 22, 49, 12, 21, -10, -33};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }

            }
        }

        int count = 0;
        for (int i : array) if (i % 3 == 0) count = i;

        System.out.println("最后一个能被3整除的数：" + count);

        System.out.println("============================");

//        现在有如下一个数组： int arr[]={1,3,4,5,11,6,6,1,5,4,7,6,7,1,5};
//          要求将以上数组中的1项去掉，将不为1的值存入一个新的数组，生成新的数组为 。
        int arr1[] = {1, 3, 4, 5, 11, 6, 6, 1, 5, 4, 7, 6, 7, 1, 5};

        //copy 数组长度
        int count1 = 0;
        for (int i : arr1) if (i != 1) count1++;

        int[] newa = new int[count1];

        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 1) {
                newa[j] = arr1[i];
                if (j == 12) {
                    j++;
                }
                j++;
            }
        }

        System.out.println(Arrays.toString(newa));


        System.out.println("============================");

//        定义一个整型数组arr={1,3,4,2,6,2,6,2,8,2,6,9,9};里面含有重复项，将该数组中重复出现的整数只保留一个，其余的删除。

        int[] arr2 = {1, 3, 4, 2, 6, 2, 6, 2, 8, 2, 6, 9, 9};

        Set set = new HashSet();
        for (int i : arr2) set.add(i);
        System.out.println(Arrays.toString(set.toArray()));
        System.out.println("============================");

//        定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，
//        统计各成绩等级（90分以上为‘A’，80~89分为‘B’，70~79分为‘C’，60~69分为‘D’，60分以下为E）学生人数，
//        并将其放入到数组count中，
//        其中：count[0]存E级的人数，
//        count[1]存D级的人数，……，
//        count[4]存A级的人数 输出ABCEE等级各有多少人
        int[] student = {72, 89, 65, 58, 87, 91, 53, 82, 71, 93, 76, 68};

        int[] count2 = new int[5];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        for (int scour : student) {
            if (scour > 90) {
                a++;
            } else if (scour > 80 && scour < 89) {
                b++;
            } else if (scour > 70 && scour < 79) {
                c++;
            } else if (scour > 60 && scour < 69) {
                d++;
            } else {
                e++;
            }
        }

        count2[0] = e;
        count2[1] = d;
        count2[2] = c;
        count2[3] = b;
        count2[4] = a;

        System.out.println(Arrays.toString(count2));
    }

    public static int getMaxNum() {
        int[] arr3 = {18, 3, 81, 57, 16, 9, -24};
        int max = 0;
        for (int i : arr3) {
            if (i % 3 == 0) {
                if (i > max) max = i;
            }
        }
        return max;
    }

}
