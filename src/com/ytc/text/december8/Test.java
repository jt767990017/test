package com.ytc.text.december8;

public class Test {
    private String name;

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class A {
    public static void main(String[] args) {
        Test a = new Test("网名");
        Test a1 = new Test("网名");
        System.out.println(a.equals(a1));

        String wangming = new String("wangming");
        String wangming1 = new String("wangming");
        System.out.println(wangming.equals(wangming1));
    }
}