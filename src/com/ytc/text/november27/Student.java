package com.ytc.text.november27;

import java.util.Objects;

public class Student extends Person {

    private int sid;


    public Student(int sid, String name, String sex, int age) {
        super(name, sex, age);
        this.sid = sid;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {

        return Objects.hash(sid);
    }
}

class SSS {
    public static void main(String[] args) {

        //hashcode 相同   equals true
        Person student = new Student(1, "黎明", "男", 28);
        Person student1 = new Student(1, "黎明", "男", 28);
/*
        Integer integer = new Integer(96354);
        Integer inte1ger = new Integer(96354);

        System.out.println("AAAAAAAAAAAAAAA");
        System.out.println(integer);
        System.out.println(inte1ger);
        System.out.println(inte1ger.equals(integer));
        System.out.println("AAAAAAAAAAAAAAA");
*/
        Person student2 = new Student(2, "黎明", "男", 28);

        System.out.println(student.equals(student1));
        System.out.println("student.hashCode()：" + student.hashCode());
        System.out.println("student1.hashCode()：" + student1.hashCode());
        System.out.println("student2.hashCode()：" + student2.hashCode());

        System.out.println(student);
        System.out.println(student1);

        System.out.println(student2);
    }
}