package com.ytc.text.december4;

import java.util.Arrays;
import java.util.Date;

public class Goods {

    private int goodsId;//  商品编号
    private String goodsName;   // 商品名称
    private String goodsType;   //  商品类型
    private double goodsPrice;   //  商品价格（元）
    private Date goodsDate; // 生产日期


    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Date getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(Date goodsDate) {
        this.goodsDate = goodsDate;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsType='" + goodsType + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsDate=" + goodsDate +
                '}';
    }

    public String toStringAll() {
        return goodsId + " " + goodsName + " " + goodsType + " " + goodsPrice +
                " " + goodsDate.toLocaleString().split(" ")[0];

    }
}
