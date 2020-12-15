package com.ytc.text.december14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class TeacherAction {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入教师姓名");
        String name = sc.next();
        System.out.println("请输入教师评分");
        int scout = sc.nextInt();
        int id = new Random().nextInt(1001) + 1;
        showTeacher(new Teacher(id, name, scout, new Date(System.currentTimeMillis())));
        System.out.println("*************存入文档中的日期*********************");
        Teacher teacher = new Teacher(id, name, scout, new SimpleDateFormat("yyyy-HH-dd").parse("2020-1-1"));
        addTeacher(teacher);
    }

    public static void showTeacher(Teacher Teacher) {
        System.out.println(Teacher.toString());
    }

    public static void addTeacher(Teacher Teacher) {
        File file = new File("TeacherInfo.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(Teacher.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
