package com.ytc.text.november28_copy_1;

public class Dog {
    private int dogid;
    private String dogname;
    private String dogType;
    private String dogPrice;
    private String dogString;


    public Dog(int dogid, String dogname, String dogType, String dogPrice, String dogString) {
        this.dogid = dogid;
        this.dogname = dogname;
        this.dogType = dogType;
        this.dogPrice = dogPrice;
        this.dogString = dogString;
    }

    public int getDogid() {
        return dogid;
    }

    public void setDogid(int dogid) {
        this.dogid = dogid;
    }

    public String getDogname() {
        return dogname;
    }

    public void setDogname(String dogname) {
        this.dogname = dogname;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    public String getDogString() {
        return dogString;
    }

    public void setDogString(String dogString) {
        this.dogString = dogString;
    }

    public String getDogPrice() {
        return dogPrice;
    }

    public void setDogPrice(String dogPrice) {
        this.dogPrice = dogPrice;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogid=" + dogid +
                ", dogname='" + dogname + '\'' +
                ", dogType='" + dogType + '\'' +
                ", dogPrice='" + dogPrice + '\'' +
                ", dogString='" + dogString + '\'' +
                '}';
    }
}
