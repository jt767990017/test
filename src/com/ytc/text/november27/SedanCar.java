package com.ytc.text.november27;

public class SedanCar extends Car {

    private String isBeautiful;

    public String getIsBeautiful() {
        return isBeautiful;
    }


    public SedanCar(String isBeautiful) {
        this.isBeautiful = isBeautiful;
    }

    public SedanCar(double price, String color, String isBeautiful) {
        super(isBeautiful, price, color);
        this.isBeautiful = isBeautiful;
    }
}
