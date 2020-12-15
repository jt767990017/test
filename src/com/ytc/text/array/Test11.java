package com.ytc.text.array;

public class Test11 {
    /**
     * long类型的数组,并且给数组的元素赋值, 求数组中大于100的
     * 偶数的个数和奇数的个数
     */
    public static void main(String[] args) {

        long[] l = {200, 600, 700, 500,231, 2, 6, 9};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < l.length; i++) {
            if (l[i] > 100) {
                if (l[i] % 2 == 0) {
                    evenCount++;

                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("偶数的个数：" + evenCount + " " + "奇数的个数" + oddCount);
    }
}
