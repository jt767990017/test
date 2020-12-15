package com.ytc.text.december15;

/**
 * 店铺
 */
public class Shop {

    String str = new String("good");
    char[] ch = { 'a', 'b', 'c' };

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }

    public static void main(String args[]) {

        Shop ex = new Shop();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);

        int a =10;
        System.out.println(~a);

    }
}
