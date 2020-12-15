package com.ytc.text.november28;


import java.util.Scanner;

public class PayrollSystem {
    public static  String[] arr = new String[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年");
        String next = scanner.next();
        System.out.println("请输入月");
        String yue = scanner.next();
        System.out.println("请输入日");
        String ri = scanner.next();
        arr[0]=next;
        arr[1]=yue;
        arr[2]=ri;
        Employee[] employees=new Employee[]{
                new SalariedEmployee("张三", 1000, new MyString("2020", "11", "28"), new HourlyEmployee(1000, 1.54), 100),
                new SalariedEmployee("李四", 1001, new MyString("2020", "11", "27"), new HourlyEmployee(1200, 1.54), 100),
                new SalariedEmployee("张萨比萨巴萨版三", 1002, new MyString("2020", "11", "29"), new HourlyEmployee(1100, 1.54), 100)
                };

        for (Employee employee : employees) {
           employee.earnings();
        }

    }
}
