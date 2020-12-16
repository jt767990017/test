package com.ytc.text.december16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Beverage {
    private int beverageId;     //  饮料编号    int类型
    private String beverageName;// 饮料名称    String类型
    private String beverageType;//  饮料类型    String类型
    private Date beverageDate;  //  生产日期    Date类型
    private int beverageCount;  //  库存数量     int类型

    public Beverage(int beverageId, String beverageName, String beverageType, Date beverageDate, int beverageCount) {
        this.beverageId = beverageId;
        this.beverageName = beverageName;
        this.beverageType = beverageType;
        this.beverageDate = beverageDate;
        this.beverageCount = beverageCount;
    }

    public Beverage() {
    }

    public int getBeverageId() {
        return beverageId;
    }

    public String getBeverageName() {
        return beverageName;
    }

    public String getBeverageType() {
        return beverageType;
    }

    public Date getBeverageDate() {
        return beverageDate;
    }

    public int getBeverageCount() {
        return beverageCount;
    }

    @Override
    public String toString() {
        return
                "饮料编号：" + beverageId +
                        ", 饮料名称：" + beverageName +
                        ", 饮料类型：" + beverageType +
                        ", 生产日期：" + new SimpleDateFormat("yyyy年MM月dd日").format(beverageDate) +
                        ", 库存数量：" + beverageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beverage beverage = (Beverage) o;
        return beverageId == beverage.beverageId && beverageCount == beverage.beverageCount && Objects.equals(beverageName, beverage.beverageName) && Objects.equals(beverageType, beverage.beverageType) && Objects.equals(beverageDate, beverage.beverageDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beverageId, beverageName, beverageType, beverageDate, beverageCount);
    }
}
