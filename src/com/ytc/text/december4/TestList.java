package com.ytc.text.december4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class TestList {

    public static void main(String[] args) throws ParseException {

        Date date = new Date(System.currentTimeMillis());
        Goods[] goods = new Goods[3];
        Goods goods1 = new Goods();
        goods1.setGoodsId(1);
        goods1.setGoodsName("树");
        goods1.setGoodsType("木材");
        goods1.setGoodsPrice(10.36);
        goods1.setGoodsDate(date);
        Goods goods2 = new Goods();
        goods2.setGoodsId(2);
        goods2.setGoodsName("树");
        goods2.setGoodsType("木材");
        goods2.setGoodsPrice(30000);
        goods2.setGoodsDate(date);
        Goods goods3 = new Goods();
        goods3.setGoodsId(3);
        goods3.setGoodsName("树");
        goods3.setGoodsType("木材");
        goods3.setGoodsPrice(2001);
        goods3.setGoodsDate(date);
        System.out.println(date);
        goods[0] = goods1;
        goods[1] = goods2;
        goods[2] = goods3;

        System.out.println(getGoodsInfo(goods).toLowerCase());

    }

    public static String getGoodsInfo(Goods[] goods) {
        String str = "";
        for (Goods good : goods) {
            if (good.getGoodsPrice() > 200 ) str += good.toString() + "\n";
        }
        return str;
    }
}
