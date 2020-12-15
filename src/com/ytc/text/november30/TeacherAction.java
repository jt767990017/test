package com.ytc.text.november30;

import java.util.Random;
import java.util.Scanner;

public class TeacherAction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //随机数生成1-1000
        Random random = new Random();
        int i = random.nextInt(1000) + 1;

        System.out.println("输入老师姓名:");
        String next = sc.next();

        System.out.println("教师评分");
        int next1 = sc.nextInt();

        showTeacher(new Teacher(i, next, next1, "2020-10-11"));

    }

    public static void showTeacher(Teacher teacher) {
        System.out.println(teacher.toString());
    }
}
