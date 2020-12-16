package com.ytc.text.december16;

import java.util.Date;

public class Phone {


    private Integer phoneId;//(ID  Integer类型)
    private String phoneName;//(手机名称 String 类型)
    private String phoneType;//(手机类型 String 类型)
    private Integer phonePrice;//(价格 Integer类型)
    private Date phoneDate;//（生产日期 Date类型）

    public Phone() {
    }

    public Phone(Integer phoneId, String phoneName, String phoneType, Integer phonePrice, Date phoneDate) {
        this.phoneId = phoneId;
        this.phoneName = phoneName;
        this.phoneType = phoneType;
        this.phonePrice = phonePrice;
        this.phoneDate = phoneDate;
    }

    public Integer getPhoneId() {
        return phoneId;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public void setPhonePrice(Integer phonePrice) {
        this.phonePrice = phonePrice;
    }

    public void setPhoneDate(Date phoneDate) {
        this.phoneDate = phoneDate;
    }

    public Integer getPhonePrice() {
        return phonePrice;
    }

    public Date getPhoneDate() {
        return phoneDate;
    }

    @Override
    public String toString() {
        return
                "手机ID：" + phoneId +
                        ", 手机名称：" + phoneName +
                        ", 手机类型：" + phoneType +
                        ", 手机价格：" + phonePrice +
                        ", 生产日期：" + phoneDate.toLocaleString();
    }
}
