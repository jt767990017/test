package com.ytc.text.december14;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class Teacher {

    private Integer teacherId;
    private String teacherName;
    private Integer teacherGrade;
    private Date teacherDate;

    public Teacher() {
    }

    public Teacher(Integer teacherId, String teacherName, Integer teacherGrade, Date teacherDate) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherGrade = teacherGrade;
        this.teacherDate = teacherDate;
    }

    @Override
    public String toString() {
        return
                "教师ID：" + teacherId +
                        ", 教师姓名：" + teacherName +
                        ", 教师评分：" + teacherGrade +
                        ", 入职日期：" + teacherDate.toLocaleString().split(" ")[0];
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getTeacherGrade() {
        return teacherGrade;
    }

    public void setTeacherGrade(Integer teacherGrade) {
        this.teacherGrade = teacherGrade;
    }

    public Date getTeacherDate() {
        return teacherDate;
    }

    public void setTeacherDate(Date teacherDate) {
        this.teacherDate = teacherDate;
    }

    @Test
    public void test() {
        FileReader fr = null;
        try {
            fr = new FileReader("TeacherInfo.txt");
            char[] chars = new char[1024];
            int len;
            while ((len = fr.read(chars)) != -1) {
                fr.read(chars, 0, len);
            }
            for (String s : String.valueOf(chars).split("；")) {
                for (String s1 : s.split("，")) {
                    if (s1.split("：")[0].contains("教师评分") && Integer.parseInt(s1.split("：")[1]) > 90) {
                        System.out.println(s);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
