package com.ytc.text.november27;

public class TestCarTruckSedan {
    public static void main(String[] args) {
        Car ct = new TruckCar("长途", 15000, "红色");
        Car cs = new SedanCar(1000, "黑色", "红光");

        System.out.println(ct.getColor().equals(cs.getColor()));
        System.out.println(ct.toString()+"\n"+cs.toString());
    }
}
