package com.ytc.text.november30;

import java.util.Arrays;
import java.util.Collections;

public class Teacher {

    private int teacherId;            //(ID  int类型)，
    private String teacherName;            //(教师姓名 String 类型)，
    private int teacherGrade;        //评分
    private String teacherString;       //（入职日期 String类型）


    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getTeacherGrade() {
        return teacherGrade;
    }

    public String getTeacherString() {
        return teacherString;
    }

    public Teacher(int teacherId, String teacherName, int teacherGrade, String teacherString) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherGrade = teacherGrade;
        this.teacherString = teacherString;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "教师ID：" + teacherId +
                ", 教师姓名：='" + teacherName + '\'' +
                ", 教师评分：" + teacherGrade +
                ", 创建日期：'" + teacherString + '\'' +
                '}';
    }
}

class TeacherService {
    public static void main(String[] args) {
        Teacher[] arr = new Teacher[]{
                new Teacher(1, "A", 10, "2020-9-1"),
                new Teacher(2, "B", 1, "2020-10-1"),
                new Teacher(3, "C", 2, "2020-11-1"),
                new Teacher(4, "D", 9, "2020-9-1")
        };
        String maxGradeTeacher = getMaxGradeTeacher(arr);
        System.out.println(maxGradeTeacher);
    }

    public static String getMaxGradeTeacher(Teacher[] list) {
        //将教师评分最低的教师名作为返回值返回


        int c = list[0].getTeacherGrade();
        for (int i = 0; i < list.length; i++) {
            if (list[i].getTeacherGrade() < c) {
                c = list[i].getTeacherGrade();
            }
        }
        String str = "";
        for (int i = 0; i < list.length; i++) {
            if (list[i].getTeacherGrade() == c) {
                str = list[i].toString();
            }
        }
        return str;
    }
}