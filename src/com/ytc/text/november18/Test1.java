package com.ytc.text.november18;

import java.util.HashSet;
import java.util.Set;

class Base {
    Base() {
        System.out.print("Base");
    }
}

public class Test1 extends Base {
    public static void main(String[] args) {
//        new Test();
//        new Base();



        int arr[]={1,1,1,1,2};
        Set s = new HashSet();
        for (int i : arr)  s.add(i);
        System.out.println(s);
    }
}
