package com.ytc.text.november15;

public class TestTwo {
    /**
     * 一个球从100高度自由落下，每次落下后反弹回原高度的一半再落下，
     * 创建OneTest类，在类中完成如下操作。
     * A.求它第3次落下时一共经过了多少米
     * B.第十次落下时反弹多高
     *
     * @param args
     */

    private static float distance = 100;

    public static void main(String[] args) {

        A();

        System.out.println("===================================");

        B();

    }

    public static void A() {

        float s = 0;
        for (int i = 1; i <= 3; i++) {
            s += distance + distance / 2;
        }
        s = s - distance;
        System.out.println("第3次落下时一共经过了 " + s + " 米");
    }


    public static void B() {

        float h = 0;
        for (int i = 1; i <= 10; i++) {
            distance = distance / 2;
        }

        h = distance;
        System.out.println("第十次落下时一共经过了 " + h + " 米");

    }

//    public static void answer() {
//        float h = 0;
//        float s = 0;
//        for (int i = 1; i <= 3; i++) {
//            s += distance + distance / 2;
//            distance = distance / 2;
//        }
//        s = s - distance;
//        h = distance;
//        System.out.println("第10次落地时，经过：" + s + "m");
//        System.out.println("第10次反弹： " + h + "m");
//    }
}
