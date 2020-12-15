package com.ytc.text.november26_copy;

class Person {
    protected String name = "person";
    protected int age = 50;

    public String getinfo() {
        return "Name：" + name + "\n" + "age：" + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    public String getinfo() {
        return "Name：" + name + "\n" + "age：" + age + "\n" + "school：" + school;
    }

}

class DoctorStudent extends Student {
    protected String major = "IT";

    public String getinfo() {
        return "Name：" + name + "\n" + "age：" + age + "\n" + "school：" + school + "major：" + major;
    }

}


class InstanceTest1 {
    public static void main(String[] args) {
        method(new Person());
    }

    public static void method(Person e) {

        if (e instanceof Person) {
            System.out.print("是一个人,");
        }

        if (e instanceof Student){
            System.out.print("是一个学生,");
        }

        if (e instanceof DoctorStudent){
            System.out.print("是一个博士生");
        }
    }
}