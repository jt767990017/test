package com.ytc.text.november27;

public class a {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    void gg(){
        System.out.println("父");
    }
}

class b extends a{
    private int a;

    public void setA(int a) {
        this.a = a;
    }
    void gg(){
        super.gg();
        System.out.println("子");
    }
}
class test{
    public static void main(String[] args) {
        a a = new a();
        a.gg();
        a.setA(5);
        System.out.println(a.getA());
        System.out.println("+++++++++++++");
        a i = new b();
        i.gg();
    }
}