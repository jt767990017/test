package com.ytc.text.november28;

public class MyString {

    private String year;
    private String month;
    private String day;

    public MyString() {
    }

    public MyString(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + " 年 " + month + " 月 " + day + "日";
    }
}
