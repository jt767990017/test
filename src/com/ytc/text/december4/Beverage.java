package com.ytc.text.december4;

import java.util.Date;
import java.util.Objects;

public class Beverage {
    private int beverageId; // 饮料编号
    private String beverageName;   //饮料名称
    private String beverageType;    // 饮料类型
    private Date beverageDate;  // 生产日期
    private int beverageCount;  // 库存数量

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

    public Beverage(int beverageId, String beverageName, String beverageType, Date beverageDate, int beverageCount) {
        this.beverageId = beverageId;
        this.beverageName = beverageName;
        this.beverageType = beverageType;
        this.beverageDate = beverageDate;
        this.beverageCount = beverageCount;
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

    @Override
    public String toString() {
        return "Beverage{" +
                "beverageId=" + beverageId +
                ", beverageName='" + beverageName + '\'' +
                ", beverageType='" + beverageType + '\'' +
                ", beverageDate=" + beverageDate.toLocaleString().split(" ")[0] +
                ", beverageCount=" + beverageCount +
                '}';
    }
}
