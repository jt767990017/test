package com.ytc.text.november28;

public class HourlyEmployee extends Employee {

    public double wage; //工资
    private double hour; //小时


    public HourlyEmployee(double wage, double hour) {
        this.wage = wage;
        this.hour = hour;
    }

    public HourlyEmployee() {
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public void earnings() {

    }

    @Override
    public String toString() {
        return String.valueOf(this.hour * this.wage);
    }
}