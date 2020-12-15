package com.ytc.text.november28;


import java.util.Date;

public abstract class Employee {

    private String name;
    private double number;
    private MyString birthday;
//    private HourlyEmployee jixiao;

    public Employee() {
    }

    public Employee(String name, double number, MyString birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
//        this.jixiao = jixiao;
    }

//    public HourlyEmployee getHourlyEmployee() {
//        return jixiao;
//    }
//
//    public void setHourlyEmployee(HourlyEmployee hourlyEmployee) {
//        this.jixiao = hourlyEmployee;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public MyString getBirthday() {
        return birthday;
    }

    public void setBirthday(MyString birthday) {
        this.birthday = birthday;
    }

    public abstract void earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "姓名='" + name + '\'' +
                ", 实际工资=" + number +
                ", 生日=" + birthday +
//                ", 绩效=" + jixiao +
                ',';
    }
}
