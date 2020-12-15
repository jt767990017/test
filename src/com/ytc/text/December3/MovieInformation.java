package com.ytc.text.December3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MovieInformation {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

        //开始的天数
        Date parse = sf.parse("2016-8-12");
        //结束的天数7
        Date parse1 = sf.parse("2018-12-28");




        int tianshu = (int) ((parse1.getTime() - parse.getTime()) / (60 * 60 * 24 * 1000));
        System.out.println(tianshu);

    }
}
