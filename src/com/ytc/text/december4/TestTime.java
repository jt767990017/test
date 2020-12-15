package com.ytc.text.december4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTime {
    public static void main(String[] args) throws ParseException {
        String s1 = "北京奥运会:2008-08-08";
        System.out.println(((new Date(System.currentTimeMillis()).getTime() - new SimpleDateFormat("yyyy-MM-dd")
                .parse(s1.split(":")[1])
                .getTime()) / (1000 * 60 * 60 * 24)));
    }
}
