package com.ytc.text.December3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog {
    private Integer dogid;//((ID  Integer类型)
    private String dogname;//((狗狗名称 String 类型)
    private String dogType;//((狗狗类型 String 类型)
    private String dogPrice;//((狗狗 Integer类型)
    private Date dogDate;//(（出生日期 Date类型）

    @Override
    public String toString() {
        return "Dog{" +
                "dogid=" + dogid +
                ", dogname='" + dogname + '\'' +
                ", dogType='" + dogType + '\'' +
                ", dogPrice='" + dogPrice + '\'' +
                ", dogDate=" + dogDate +
                '}';
    }

    public Dog(Integer dogid, String dogname, String dogType, String dogPrice, Date dogDate) {
        this.dogid = dogid;
        this.dogname = dogname;
        this.dogType = dogType;
        this.dogPrice = dogPrice;
        this.dogDate = dogDate;
    }

    public Integer getDogid() {
        return dogid;
    }

    public String getDogname() {
        return dogname;
    }

    public String getDogType() {
        return dogType;
    }

    public String getDogPrice() {
        return dogPrice;
    }

    public Date getDogDate() {
        return dogDate;
    }
}

class DogService {
    public static void main(String[] args) throws ParseException {
        Dog[] DogArr = new Dog[]{
                new Dog(1, "量", "泰迪", "1000", new Date(2020, 1, 2)),
                new Dog(2, "量1", "泰迪1", "10001", new Date(2005,1,3)),
                new Dog(3, "量2", "泰迪2", "10002", new Date(1998,2,5))
        };

        getDogByAge(DogArr);
    }

    public static String getDogByAge(Dog[] dogs) throws ParseException {
        //程序返回数组中狗狗类型为泰迪并且狗狗年限小于等于5的狗狗信息
        long date = new Date(System.currentTimeMillis()).getTime();

        for (Dog dog : dogs) {
            long time = dog.getDogDate().getTime();


            int a = (int) (date - time);
            if (a < 5) {
                System.out.println(new Date(a));
            }
        }
        return "";
    }
}
