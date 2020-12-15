package com.ytc.text.december4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestString {
    public static void main(String[] args) throws ParseException {
        String str1 = "1，方便面，食品，5.5，2016-12-25";
        String str2 = "2，手电筒，电器，15.5，2015-02-11";

        String[] split1 = str1.split("，");
        Goods goods = new Goods();

        goods.setGoodsId(Integer.parseInt(split1[0]));
        goods.setGoodsName(split1[1]);
        goods.setGoodsType(split1[2]);
        goods.setGoodsPrice(Double.parseDouble(split1[3]));
        goods.setGoodsDate(new SimpleDateFormat("yyyy-MM-dd").parse(split1[4]));

        String[] split2 = str2.split("，");
        Goods goods1 = new Goods();
        goods1.setGoodsId(Integer.parseInt(split2[0]));
        goods1.setGoodsName(split2[1]);
        goods1.setGoodsType(split2[2]);
        goods1.setGoodsPrice(Double.parseDouble(split2[3]));
        goods1.setGoodsDate(new SimpleDateFormat("yyyy-MM-dd").parse(split2[4]));
        System.out.println(goods.toString() + "\n" + goods1.toString());
    }
}
