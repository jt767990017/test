package com.ytc.text.november18;

public class Czcxlx004 {
    public static void main(String[] args) {
        Czcxlx004 test=new Czcxlx004();
        test.first();
    }
    public void first(){
        int i=5;
        value v =new value();
        v.i=25;
        second(v,i);
        v.i=v.i+10;
        System.out.println(v.i+"lll");
    }
    public void second (value v,int i){
        i=0;
        v.i=20;
        value val=new value();
        v = val;
        System.out.println(v.i+" "+ i+"GGG");

    }


class value{
    int i=15;
    }
}
