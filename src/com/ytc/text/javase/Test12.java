package com.ytc.text.javase;

public class Test12 {
    /**
     * 循环判断 1—1000 中的所有数 并判断他们是奇数还是偶数。
     */
    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 != 0) {
                str = "这个数是奇数";
            } else {
                str = "偶数";
            }
            System.out.println(str + ": " + i);
        }
    }
}
