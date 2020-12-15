package com.ytc.text.november27;

/**
 * 员工类
 */
public class Employee {


    private String name;
    private String jobNumber;
    private double wage;

    public String getName() {
        return name;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public double getWage() {
        return wage;
    }

    public Employee(String name, String jobNumber, double wage) {
        this.name = name;
        this.jobNumber = jobNumber;
        this.wage = wage;
    }

    public void bonus(String jobNumber, double wage) {
        System.out.println(jobNumber.substring(4));
        if (jobNumber.substring(4).equals("1")) {
            System.out.println(this.name + "奖金：" + (wage * EmployeeWage.BONUS));
        } else {
            System.out.println(this.name + "奖金：" + (wage * EmployeeWage.BONUSMAX));
        }
    }
}
class AB{
    public static void main(String[] args) {
        Employee ez = new Employee("张三", "15001", 5000);
        Employee es = new Employee("张四", "25002", 10000);

        ez.bonus(ez.getJobNumber(),ez.getWage());
        es.bonus(es.getJobNumber(),es.getWage());

    }
}
