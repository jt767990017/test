package com.ytc.text.november28_copy_1;

import java.util.Arrays;

public class DogDao {


    public static void main(String[] args) {

        Dog[] dogs = new DogDao().setDogInfo();

        for (Dog dog : dogs) {
            if (dog.getDogType().equals("家养型")) {
                dog.setDogname("小黑");
                dog.setDogType("6");
            }
            System.out.println(dog);
        }

    }

    public Dog[] setDogInfo() {
        return new Dog[]{
                new Dog(1, "黄欢1", "家养型", "7", "2020-1-1"),
                new Dog(2, "黄欢2", "藏獒", "板凳2", "2020-1-2"),
                new Dog(3, "黄欢3", "藏獒", "板凳3", "2020-1-13"),
                new Dog(4, "黄欢4", "藏獒", "板凳4", "2020-1-14")
        };

    }
}
