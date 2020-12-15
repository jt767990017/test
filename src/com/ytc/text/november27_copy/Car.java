package com.ytc.text.november27_copy;

import java.util.Objects;

public class Car {

    private String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor());
    }

    private String model;


    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class AA{
    public static void main(String[] args) {
        Car car = new Car("红色", "A11B25");
        Car car1 = new Car("红色", "C!59891");
        System.out.println(car.equals(car1));
        System.out.println(car);
        System.out.println(car1);
        String s = String.valueOf(new Integer(10));
        System.out.println(s);
        System.out.println(car.toString().replaceAll("Car","小车"));

    }
}