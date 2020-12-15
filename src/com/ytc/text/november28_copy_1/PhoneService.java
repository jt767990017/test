package com.ytc.text.november28_copy_1;

public class PhoneService {


    public static void main(String[] args) {
        Phone[] phones = new Phone[]{
                new Phone(1, "苹果", "平板", 5000, "2020-9-2"),
                new Phone(2, "华为", "平板", 4000, "2020-10-4"),
                new Phone(3, "小米", "平板", 2001, "2020-11-5"),
                new Phone(4, "一家", "平板", 2300, "2020-12-7")
        };

        PhoneService phoneService = new PhoneService();
        String phoneByTypeAndPrice = phoneService.getPhoneByTypeAndPrice(phones);
        System.out.println(phoneByTypeAndPrice);
    }

    public String getPhoneByTypeAndPrice(Phone[] phones) {
        String str = "";
        for (Phone phone : phones) {
            if (phone.getPhonePrice() >= 4000) {
                str += " 手机名称 " + phone.getPhoneName() + " 生产日期 " + phone.getPhoneString() + "\n";
            }
        }
        return str;
    }
}
