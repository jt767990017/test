package com.ytc.text.november26;

public class Load extends A implements UsbInterface {

    @Override
    public void load() {
        System.out.println("厂家：" + UsbInterface.FACTORY + "\n" + "内存大小：" + UsbInterface.RAM + "\n" + "版本号：" + UsbInterface.VERSION);
    }

    public static void main(String[] args) {
        new Load().load();
        System.out.println("========================");
        new UsbInterface() {
            @Override
            public void load() {
                String str = "";
                if (Integer.parseInt(UsbInterface.VERSION) <= 3) {
                    str = "慢接口";
                } else {
                    str = "快接口";
                }
                System.out.println("厂家：" + UsbInterface.FACTORY + "\n" + "内存大小：" + UsbInterface.RAM + "\n" + "版本号：" + UsbInterface.VERSION + "\n" + str);
            }
        }.load();

        System.out.println("------------继承A类------------");
        A a = new Load();
        a.show();
    }
}
