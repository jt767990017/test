package com.ytc.text.november28_copy_1;

public class Phone {
    private int phoneId;
    private String phoneName;
    private String phoneType;
    private int phonePrice;
    private String phoneString;

    public int getPhoneId() {
        return phoneId;
    }

    public Phone(int phoneId, String phoneName, String phoneType, int phonePrice, String phoneString) {
        this.phoneId = phoneId;
        this.phoneName = phoneName;
        this.phoneType = phoneType;
        this.phonePrice = phonePrice;
        this.phoneString = phoneString;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public int getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(int phonePrice) {
        this.phonePrice = phonePrice;
    }

    public String getPhoneString() {
        return phoneString;
    }

    public void setPhoneString(String phoneString) {
        this.phoneString = phoneString;
    }
}
