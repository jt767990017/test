package com.ytc.text.array;

import java.util.Scanner;

public class ArrayStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("从键盘读入学生人数?");
        int count = sc.nextInt();


        //创建数组 存放学生成绩
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            int scour = i + 1;
            System.out.println("请输入" + scour + "个学生成绩");
            arr[i] = sc.nextInt();
        }

        //最大成绩
        int maxScour = 0;

        //成绩等级
        String str = "";
        for (int j = 0; j < arr.length; j++) {

            if (maxScour < arr[j]) { // 获取最大成绩
                maxScour = arr[j];
            }

            if (arr[j] >= maxScour - 10 && maxScour > 79) {
                str = "A";
            } else if (arr[j] >= maxScour - 20 && maxScour > 69) {
                str = "B";
            } else if (arr[j] >= maxScour - 30 && maxScour > 59) {
                str = "C";
            } else {
                str = "D";
            }
            System.out.println("student" + " " + j + " " + "scour is" + " " + arr[j] + " " + "grade is" + " " + str);
        }


    }
}
