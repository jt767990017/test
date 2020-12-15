package com.ytc.text.javase;

import java.text.SimpleDateFormat;

public class Test1 {
    /**
     * 练习
     *
     * @param args
     */
    public static void main(String[] args) {
        System.err.println("当前时间\t" + new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(System.currentTimeMillis()));
        int i1 = 10;
        int i2 = 20;

        int i = i1++;
        //10
        System.out.print("i=" + i);
        //11
        System.out.println(" i1=" + i1);
        System.out.println("=======");
        i = ++i1;
        // 12
        System.out.print("i=" + i);
        //12
        System.out.println(" i1=" + i1);
        System.out.println("=========");
        i = i2--;
        //20
        System.out.print("i=" + i);
        //19
        System.out.println(" i2=" + i2);
        System.out.println("=========");
        i = --i2;
        //18
        System.out.print("i=" + i);
        //18
        System.out.println(" i2=" + i2);

        System.out.println("************************************");
        int number = 578;
        //个位
        int g = number % 10;
        System.out.println("个位\t" + g);
        //十位
        int s = number / 10 % 10;
        System.out.println("十位\t" + s);
        //百位
        int b = number / 100 % 10;
        System.out.println("百位\t" + b);
        System.out.println("***********************************");
        System.out.println("====================================");
        /**
         * 练习3
         */
        int x = 1;
        int y = 1;
        if (x++ == 2 || ++y == 2) {
            x = 7;
        }
        System.out.println("x=" + x + ",y=" + y);
//        System.out.println("********\t练习4\t**********");
//        int x = 1,y = 1;
//        if(x++==2 && ++y==2){
//            x =7;
//        }
//        System.out.println("x="+x+",y="+y);
//        System.out.println("********\t练习5\t**********");
//        int x = 1,y = 1;
//        if(x++==1 | ++y==1){
//            x =7;
//        }
//        System.out.println("x="+x+",y="+y);
        /*int x = 1,y = 1;
        if(x++==1 || ++y==1){
            x =7;
        }
        System.out.println("x="+x+",y="+y);*/
    }
}
