package com.ytc.text.november27;

public class TruckCar extends Car {

    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public TruckCar(String cargo, double price, String color) {
        super(cargo,price,color);
        this.cargo = cargo;
    }



    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
