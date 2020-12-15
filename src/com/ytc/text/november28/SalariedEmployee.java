package com.ytc.text.november28;

public class SalariedEmployee extends Employee {

    private double monthlySalary;
    private HourlyEmployee jixiao;

    public SalariedEmployee() {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, double number, MyString birthday, HourlyEmployee hourlyEmployee, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
        this.jixiao = hourlyEmployee;
    }

    @Override
    public void earnings() {

        if (super.getBirthday().getYear().equals(PayrollSystem.arr[0]) && PayrollSystem.arr[1].equals(super.getBirthday().getMonth()) && PayrollSystem.arr[2].equals(super.getBirthday().getDay())) {
            System.out.println(super.toString() + " 生日奖励：" + this.monthlySalary + ", 绩效：" + jixiao.toString() + "}");
        } else {
            System.out.println(super.toString() + "生日奖励：" + 0.0 + "，绩效：" + jixiao.toString() + "}");
        }

    }
}
